import java.util.HashMap;
import java.util.Map;

/**
 * Created by admin on 2016/5/8.
 */
public abstract class TimeSubject {
    protected Map<String,Clock> clocks = new HashMap<String, Clock>();

    public void attach(String citiName,Clock clock){
        clocks.put(citiName,clock);
    }

    public void detach(String cityName){
        clocks.remove(cityName);
    }
    public abstract void notifyAllClocks();
}
