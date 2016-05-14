/**
 * Created by admin on 2016/5/13.
 */
public class CityClock {

    private int utcOffset;

    public CityClock(int utcOffset) {
        
    }

    public int getTime() {
        return this.utcOffset + this.utcZeroYimr;
    }
}
