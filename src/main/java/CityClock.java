/**
 * Created by admin on 2016/5/13.
 */
public class CityClock {

    public CityClock(int utcOffset) {
        
    }

    public int getTime() {
        return this.utcOffset + this.utcZeroYimr;
    }
}
