package com.epam.training.math;

import com.epam.training.math.task1.entity.Number;
import com.epam.training.math.task1.service.NumberService;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NumberServiceTest {

    @Test
    public void getLastDigitOfSquare() {
        Number number = new Number(34);
        NumberService numberService = new NumberService();
        double expected = 6;
        double resultDigit = numberService.getLastDigitOfSquare(number);
        assertEquals(resultDigit, expected);
    }
}
