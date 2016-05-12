import java.util.concurrent.Callable;

/**
 * Created by admin on 2016/5/8.
 */
public abstract class Clock{
    protected static int UTC_OFFSET = 0;
    protected int localTime = 0;

    public Clock(int utcOffset) {
        UTC_OFFSET = utcOffset;
    }

    public  abstract  void  setLocalTime (int localTime);

    public static int toLocalTime(int utcZeroTime) {
        return utcZeroTime + UTC_OFFSET;
    }

    public String getTime() {
        return String.valueOf(this.localTime);
    }
}

























