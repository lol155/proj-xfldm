/**
 * Created by admin on 2016/5/8.
 */
public abstract class Clock{
    private final static int UTC_OFFSET = 0;
    private int localTime = 0;
    public  abstract  void  setLocalTime (int localTime);

    public static int toLocalTime(int utcZeroTime) {
        return utcZeroTime + UTC_OFFSET;
    }
}

























