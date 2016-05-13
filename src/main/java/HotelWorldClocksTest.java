import org.junit.Test;

public class HotelWorldClocksTest{
    @Test
    public void the_time_of_clock_London_should_be_1_after_the_phone_clock_is_set_to_9_Beijing_time(){
        //Arrange
        phoneClock.setCityClock(londonClock);
        phoneClock.setTime(9);

        //Act
        CityClock londonClock = new CityClock(0);
        PhoneClock phoneClock = new PhoneClock(8);

        //Assert
        assertEquals(1, londonClock.getTime());
    }
}
