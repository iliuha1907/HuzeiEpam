package com.epam.training.math.task6.entity;

import com.epam.training.math.task6.exception.SecondException;

public class Second {

    private int value;

    public Second(int value) {
        if (value < 1) {
            throw new SecondException("Error at creating second: value is incorrect");
        }
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Second{");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
