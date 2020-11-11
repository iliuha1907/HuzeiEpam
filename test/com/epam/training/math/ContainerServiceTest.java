package com.epam.training.math;

import com.epam.training.math.task4.service.ContainerService;
import com.epam.training.math.task4.entity.FourNumbersContainer;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContainerServiceTest {

    @Test
    public void checkContainer() {
        FourNumbersContainer container = new FourNumbersContainer();
        container.setValue(0, 1);
        container.setValue(0, 2);
        container.setValue(0, 3);
        container.setValue(0, 4);
        ContainerService service = new ContainerService();
        boolean expected = true;
        boolean resultStatement = service.checkContainer(container);
        assertEquals(expected, resultStatement);
    }
}
