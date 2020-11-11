package com.epam.training.math.task6.service;

import com.epam.training.math.task6.entity.Second;

public class TimeService {
    private static final int MINUTE_DIVIDER = 60;
    private static final int HOUR_DIVIDER = 3600;

    public int extractMinutes(Second second) {
        return second.getValue() / MINUTE_DIVIDER;
    }

    public int extractHours(Second second) {
        return second.getValue() / HOUR_DIVIDER;
    }

    public int extractSeconds(Second second) {
        return second.getValue();
    }
}
