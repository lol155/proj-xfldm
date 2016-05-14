/**
 * Created by admin on 2016/5/13.
 */
public class PhoneClock {
    private CityClock cityClock;
    private int utcOffset;

    public void setHotelWorldClockSystem(HotelWorldClockSystem hotelWorldClockSystem) {
        this.hotelWorldClockSystem = hotelWorldClockSystem;
    }

    private HotelWorldClockSystem hotelWorldClockSystem;

    public PhoneClock(int utcOffset) {
        this.utcOffset = utcOffset;
    }

    public void setCityClock(CityClock cityClock) {
        this.cityClock = cityClock;
    }


    public void setTime(int time) {
        for (CityClock cityClock :
                this.hotelWorldClockSystem.getClocks()) {
            this.cityClock.setUtcZeroTime(time - this.utcOffset);
        }
    }

    public void setHotelWorldClockSystem(HotelWorldClockSysTem hotelWorldClockSystem) {
    }
}
