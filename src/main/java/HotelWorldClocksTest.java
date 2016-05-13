import CityClock.CityClock;
import PhoneClock.PhoneClock;
import org.junit.Test;

public class HotelWorldClocksTest{
    @Test
    public void the_time_of_clock_London_should_be_1_after_the_phone_clock_is_set_to_9_Beijing_time(){
        //Arrange
        CityClock londonClock = new CityClock(0);
        PhoneClock phoneClock = new PhoneClock(8);

        //Act
        phoneClock.setCityClock(londonClock);
        phoneClock.setTime(9);

        //Assert
        assertEquals(1, londonClock.getTime());
    }
}
