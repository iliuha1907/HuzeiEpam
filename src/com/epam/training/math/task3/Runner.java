package com.epam.training.math.task3;

import com.epam.training.math.task3.entity.Square;
import com.epam.training.math.task3.exception.SquareException;
import com.epam.training.math.task3.report.AreaReport;
import com.epam.training.math.task3.service.SquareService;

public class Runner {

    public static void main(String[] args) {
        Square square;
        try {
            square = new Square(10);
        } catch (SquareException ex) {
            System.err.println(ex.getMessage());
            return;
        }
        SquareService squareService = new SquareService();
        double resultProportion = squareService.getAreasProportion(square);
        AreaReport areaReport = new AreaReport();
        areaReport.reportProportion(square, resultProportion);
    }
}
