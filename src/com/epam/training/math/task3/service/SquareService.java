package com.epam.training.math.task3.service;

import com.epam.training.math.task3.entity.Square;

public class SquareService {

    public double getAreasProportion(Square square) {
        double smallArea = getAreaOfInscribedSquare(square);
        return getAreaOfSquare(square) / smallArea;
    }

    private double getAreaOfInscribedSquare(Square square) {
        double bigArea = getAreaOfSquare(square);
        return bigArea / 2;
    }

    private double getAreaOfSquare(Square square) {
        double side = square.getSide();
        return side * side;
    }
}
