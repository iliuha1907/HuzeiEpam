package com.epam.training.math.task5.entity;

public class IntegerNumber {

    private int value;

    public IntegerNumber(int value) {
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
        final StringBuilder sb = new StringBuilder("IntegerNumber{");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
