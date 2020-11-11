package com.epam.training.math.task6;

import com.epam.training.math.task6.entity.Second;
import com.epam.training.math.task6.report.TimeReport;
import com.epam.training.math.task6.service.TimeService;

public class Runner {

    public static void main(String[] args) {
        Second second = new Second(10000);
        TimeService timeService = new TimeService();
        int seconds = timeService.extractSeconds(second);
        int minutes = timeService.extractMinutes(second);
        int hours = timeService.extractHours(second);

        TimeReport timeReport = new TimeReport();
        timeReport.reportSeconds(second, seconds);
        timeReport.reportMinutes(second, minutes);
        timeReport.reportHours(second, hours);
    }
}
