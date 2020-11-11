package com.epam.training.math.task5;

import com.epam.training.math.task5.entity.IntegerNumber;
import com.epam.training.math.task5.report.IntegerNumberReport;
import com.epam.training.math.task5.service.IntegerNumberService;

public class Runner {

    public static void main(String[] args) {
        IntegerNumber number = new IntegerNumber(25);
        IntegerNumberService integerNumberService = new IntegerNumberService();
        boolean resultPerfect = integerNumberService.isNumberPerfect(number);
        IntegerNumberReport report = new IntegerNumberReport();
        report.reportNumber(number, resultPerfect);
    }
}
