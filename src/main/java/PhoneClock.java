/**
 * Created by admin on 2016/5/13.
 */
public class PhoneClock extends Clock{

    private HotelWorldClockSystem hotelWorldClockSystem;
    private int time;

    public void setHotelWorldClockSystem(HotelWorldClockSystem hotelWorldClockSystem) {
        this.hotelWorldClockSystem = hotelWorldClockSystem;
    }

    public PhoneClock(int utcOffset) {
        super.utcOffset = utcOffset;
    }

    public void setTime(int time) {
        this.time = time;
        if(this.hotelWorldClockSystem == null ) return;
        for (CityClock cityClock :
                this.hotelWorldClockSystem.getClocks()) {
            cityClock.setUtcZeroTime(time - super.utcOffset);
        }
    }
    @Override
    public int getTime() {
        return this.time;
    }
}
