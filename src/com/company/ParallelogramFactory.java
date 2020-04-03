package com.company;

public class ParallelogramFactory {
    public static Parallelogram create(Double sideA, Double sideB, Double angle) {
        if(sideA == null || sideB == null || angle == null)
            return null;

        return new Parallelogram(sideA, sideB, angle);
    }
}
