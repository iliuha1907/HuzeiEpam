package com.epam.training.math.task1;

import com.epam.training.math.task1.entity.Number;
import com.epam.training.math.task1.report.NumberReport;
import com.epam.training.math.task1.service.NumberService;

public class Runner {

    public static void main(String[] args) {
        Number number = new Number(34);
        NumberService numberService = new NumberService();
        double resultDigit = numberService.getLastDigitOfSquare(number);
        NumberReport numberReport = new NumberReport();
        numberReport.reportLastDigitOfSquare(number, resultDigit);
    }
}
