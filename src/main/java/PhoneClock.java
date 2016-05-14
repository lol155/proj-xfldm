/**
 * Created by admin on 2016/5/13.
 */
public class PhoneClock {
    private CityClock cityClock;
    private int utcOffset;

    public PhoneClock(int utcOffset) {
        this.utcOffset = utcOffset;
    }

    public void setCityClock(CityClock cityClock) {
        this.cityClock = cityClock;
    }


    public void setTime(int time) {
        this.cityClock.setUtcZeroTime(time - this.utcOffset);
    }

}
