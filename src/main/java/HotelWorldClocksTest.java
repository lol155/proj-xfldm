import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelWorldClocksTest {
    @Test
    public void the_time_of_clock_London_should_be_1_after_the_phone_clock_is_set_to_9_Beijing_time() {
        //Arrange
        CityClock londonClock = new CityClock(0);
        HotelWorldClockSystem hotelWorldClockSystem = new HotelWorldClockSystem();
        hotelWorldClockSystem.attach(londonClock);
        PhoneClock phoneClock = new PhoneClock(8);
        //Act
        phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
        phoneClock.setTime(9);

        //Assert
        assertEquals(1, londonClock.getTime());
    }

    @Test
    public void the_time_of_clock_NewYork_should_be_1_after_the_phone_clock_is_set_to_9_Beijing_time() {
        //Arrange
        CityClock newYorkCity = new CityClock(-5);
        HotelWorldClockSystem hotelWorldClockSystem = new HotelWorldClockSystem();
        hotelWorldClockSystem.attach(newYorkCity);
        PhoneClock phoneClock = new PhoneClock(8);
        //Act
        phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
        phoneClock.setTime(9);

        //Assert
        assertEquals(20, newYorkCity.getTime());
    }

    @Test
    public void the_time_of_clock_London_and_NewYork_should_be_1_and_20_after_the_phone_clock_is_set_to_9_Beijing_time() {
        //Arrange
        CityClock londonClock = new CityClock(0);
        CityClock newYorkCity = new CityClock(-5);
        HotelWorldClockSystem hotelWorldClockSysTem = new HotelWorldClockSystem();
        hotelWorldClockSysTem.attach(londonClock);
        hotelWorldClockSysTem.attach(newYorkCity);
        PhoneClock phoneClock = new PhoneClock(8);
        //Act
        phoneClock.setHotelWorldClockSystem(hotelWorldClockSysTem);
        phoneClock.setTime(9);

        //Assert
        assertEquals(1, londonClock.getTime());
        assertEquals(20, newYorkCity.getTime());
    }

    @Test
    public void the_time_of_the_phone_clock_should_be_set_correctly_after_its_setTime_method_is_invoked() {
        //Arrange
        PhoneClock phoneClock = new PhoneClock(8);
        //Act
        phoneClock.setTime(9);
        //Assert
        assertEquals(9, phoneClock.getTime());
    }
}
