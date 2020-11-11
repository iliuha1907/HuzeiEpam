package com.epam.training.math.task5.report;

import com.epam.training.math.task5.entity.IntegerNumber;

public class IntegerNumberReport {

    public void reportNumber(IntegerNumber number, boolean isPerfect) {
        System.out.println(number + " is " + (isPerfect ? "perfect" : "not perfect"));
    }
}
