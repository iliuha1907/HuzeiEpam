package com.epam.training.math.task6.report;

import com.epam.training.math.task6.entity.Second;

public class TimeReport {

    public void reportSeconds(Second second, int value) {
        System.out.println(second + " contains " + value + " seconds");
    }

    public void reportMinutes(Second second, int value) {
        System.out.println(second + " contains " + value + " minutes");
    }

    public void reportHours(Second second, int value) {
        System.out.println(second + " contains " + value + " hours");
    }
}
