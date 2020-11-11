package com.epam.training.math.task4.service;

import com.epam.training.math.task4.entity.FourNumbersContainer;

import java.util.Random;

public class ContainerCreator {

    public void fillRandomized(FourNumbersContainer container) {
        int size = container.getValues().length;
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            container.setValue(i, random.nextInt());
        }
    }
}
