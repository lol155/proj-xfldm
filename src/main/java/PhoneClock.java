/**
 * Created by admin on 2016/5/13.
 */
public class PhoneClock {
    private CityClock cityClock;

    public PhoneClock(int utcOffset) {

    }

    public void setCityClock(CityClock cityClock) {
        this.cityClock = cityClock;
    }


    public void setTime(int time) {
        this.cityClock.setUtcZeroTime(time - this.utcOffset);
    }

}
