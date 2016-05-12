/**
 * Created by admin on 2016/5/12.
 */
public class CityClock extends Clock {
    private UtcTime utcTime;

    public CityClock(int utcOffset) {
        super(utcOffset);
    }


    public void setLocalTime(int localTime) {
        this.localTime = localTime;
    }
}
