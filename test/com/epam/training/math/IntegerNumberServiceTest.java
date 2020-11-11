package com.epam.training.math;

import com.epam.training.math.task5.entity.IntegerNumber;
import com.epam.training.math.task5.service.IntegerNumberService;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class IntegerNumberServiceTest {

    @Test
    public void isNumberPerfect() {
        IntegerNumber number = new IntegerNumber(25);
        IntegerNumberService integerNumberService = new IntegerNumberService();
        boolean expected = false;
        boolean resultPerfect = integerNumberService.isNumberPerfect(number);
        assertEquals(expected, resultPerfect);
    }
}
