/**
 * Created by admin on 2016/5/13.
 */
public class CityClock {

    private int utcOffset;
    private int utcZeroTime;

    public CityClock(int utcOffset) {
        this.utcOffset = utcOffset;
    }

    public int getTime() {
        return this.utcOffset + this.utcZeroTime;
    }

    public void setUtcZeroTime(int utcZeroTime) {
        this.utcZeroTime = utcZeroTime;
    }
}
