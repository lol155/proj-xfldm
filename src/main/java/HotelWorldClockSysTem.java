import java.util.ArrayList;

/**
 * Created by admin on 2016/5/14.
 */
public class HotelWorldClockSystem {

    private ArrayList<CityClock> cityClocks = new ArrayList<CityClock>();

    public void attach(CityClock cityClock) {
        this.cityClocks.add(cityClock);
    }

    public ArrayList<CityClock> getClocks() {
        return this.cityClocks;
    }
}
