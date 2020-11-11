package com.epam.training.math.task4.service;

import com.epam.training.math.task4.entity.FourNumbersContainer;

public class ContainerService {

    public boolean checkContainer(FourNumbersContainer container) {
        int count = 0;
        int[] values = container.getValues();
        int size = values.length;
        for (int i = 0; i < size; i++) {
            if (values[i] % 2 == 0) {
                count++;
            }
        }
        return count > 1;
    }
}
