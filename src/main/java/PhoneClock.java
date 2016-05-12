/**
 * Created by admin on 2016/5/12.
 */
public class PhoneClock extends Clock {
    private UtcTime utcTime;

    public PhoneClock(int utcOffset) {
        super(utcOffset);
    }

    public void setLocalTime(int localTime) {
        this.localTime = localTime;
        this.utcTime.setUtcZeroTime(localTime - UTC_OFFSET);
    }

    public void setUtcTime(UtcTime utcTime) {
        this.utcTime = utcTime;
    }
}
