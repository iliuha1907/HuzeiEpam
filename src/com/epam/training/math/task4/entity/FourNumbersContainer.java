package com.epam.training.math.task4.entity;

import java.util.Arrays;

public class FourNumbersContainer {

    private int[] values = new int[4];

    public int[] getValues() {
        return values;
    }

    public void setValue(int i, int value) {
        if (i < 0 || i > values.length - 1) {

        }
        values[i] = value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FourNumbersContainer{");
        sb.append("values=").append(Arrays.toString(values));
        sb.append('}');
        return sb.toString();
    }
}
