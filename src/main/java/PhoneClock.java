/**
 * Created by admin on 2016/5/12.
 */
public class PhoneClock extends Clock {
    private UtcTime utcTime;

    public void setLocalTime(int localTime) {
        this.localTime = localTime;
        this.utcTime.setUtcZeroTime(localTime - UTC_OFFSET);
    }
}
