package com.company;

public class RectangleFactory {
    public static Rectangle create(Double sideA, Double sideB) {
        if (sideA == null || sideB == null) return null;

        return new Rectangle(sideA, sideB);
    }
}
