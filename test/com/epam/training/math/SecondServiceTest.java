package com.epam.training.math;

import com.epam.training.math.task6.entity.Second;
import com.epam.training.math.task6.service.TimeService;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SecondServiceTest {

    @Test
    public void extractSeconds() {
        Second second = new Second(10000);
        TimeService timeService = new TimeService();
        int expected = 10000;
        int seconds = timeService.extractSeconds(second);
        assertEquals(expected, seconds);
    }

    @Test
    public void extractMinutes() {
        Second second = new Second(10000);
        TimeService timeService = new TimeService();
        int expected = 166;
        int minutes = timeService.extractMinutes(second);
        assertEquals(expected, minutes);
    }

    @Test
    public void extractHours() {
        Second second = new Second(10000);
        TimeService timeService = new TimeService();
        int expected = 2;
        int hours = timeService.extractHours(second);
        assertEquals(expected, hours);
    }
}
