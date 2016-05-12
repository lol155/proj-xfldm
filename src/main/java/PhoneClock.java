/**
 * Created by admin on 2016/5/12.
 */
public class PhoneClock extends Clock {
    public void setLocalTime(int localTime) {
        this.localTime = localTime;
        this.utcTime.setUtcZeroTime(localTime - UTC_OFFSET);
    }
}
