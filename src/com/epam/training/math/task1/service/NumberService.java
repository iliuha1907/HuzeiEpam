package com.epam.training.math.task1.service;

import com.epam.training.math.task1.entity.Number;

public class NumberService {

    public double getLastDigitOfSquare(Number number) {
        double value = number.getValue();
        double lastDigit = getLastDigit(value);
        return getLastDigit(lastDigit * lastDigit);
    }

    private double getLastDigit(double value) {
        return value % 10;
    }
}
