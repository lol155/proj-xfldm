
public class UtcTime extends TimeSubject {
    private int utcZeroTime;

    public void notifyAllClocks() {
        for (Clock clock : super.clocks.values()){
            clock.setLocalTime(Clock.toLocalTime(this.utcZeroTime));
        }
    }

    public int getUtcZeroTime() {
        return utcZeroTime;
    }

    public void setUtcZeroTime(int utcZeroTime) {
        this.utcZeroTime = utcZeroTime;
        notifyAllClocks();
    }

    public void printTimeOfAllClocks() {
        for(String clockName : super.clocks.keySet()){
            System.out.println(clockName + ":" + super.clocks.get(clockName).getTime());
        }
    }
}
