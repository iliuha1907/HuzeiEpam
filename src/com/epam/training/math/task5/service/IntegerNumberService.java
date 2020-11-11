package com.epam.training.math.task5.service;

import com.epam.training.math.task5.entity.IntegerNumber;

public class IntegerNumberService {

    public boolean isNumberPerfect(IntegerNumber number) {
        int value = number.getValue();
        int bound = value / 2;
        int dividerCount = 1;
        for (int i = 2; i < bound + 1; i++) {
            if (value % i == 0) {
                dividerCount++;
            }
        }
        return dividerCount == value;
    }
}
