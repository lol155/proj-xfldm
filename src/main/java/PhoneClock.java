/**
 * Created by admin on 2016/5/13.
 */
public class PhoneClock {
    public PhoneClock(int utcOffset) {

    }

    public void setCityClock(CityClock londonClock) {
    }


    public void setTime(int time) {
        this.cityClock.setUtcZeroTime(time - this.utcOffset);
    }
}
