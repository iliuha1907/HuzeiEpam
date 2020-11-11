package com.epam.training.math;

import com.epam.training.math.task3.entity.Square;
import com.epam.training.math.task3.service.SquareService;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SquareServiceTest {

    @Test
    public void getAreasProportion() {
        Square square = new Square(10);
        SquareService squareService = new SquareService();
        double expected = 2;
        double resultProportion = squareService.getAreasProportion(square);
        assertEquals(expected, resultProportion);
    }
}
