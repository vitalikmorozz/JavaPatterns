package com.company;

public class SquareFactory {
    public static Square create(Double side) {
        if(side == null)
            return null;

        return new Square(side);
    }
}
