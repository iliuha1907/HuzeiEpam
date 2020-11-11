package com.epam.training.math.task3.entity;

import com.epam.training.math.task3.exception.SquareException;

public class Square {

    private double side;

    public Square(double side) {
        if (side <= 0) {
            throw new SquareException("Error at creatong square: invalid side");
        }
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Square{");
        sb.append("side=").append(side);
        sb.append('}');
        return sb.toString();
    }
}
