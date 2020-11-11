package com.epam.training.math.task4;

import com.epam.training.math.task4.entity.FourNumbersContainer;
import com.epam.training.math.task4.report.ContainerReport;
import com.epam.training.math.task4.service.ContainerCreator;
import com.epam.training.math.task4.service.ContainerService;

public class Runner {

    public static void main(String[] args) {
        FourNumbersContainer container = new FourNumbersContainer();
        ContainerCreator creator = new ContainerCreator();
        creator.fillRandomized(container);
        ContainerService service = new ContainerService();
        boolean resultStatement = service.checkContainer(container);
        ContainerReport report = new ContainerReport();
        report.reportContainer(container, resultStatement);
    }
}
