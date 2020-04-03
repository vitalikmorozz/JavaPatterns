package com.company;

public class DiamondFactory {
    public static Diamond create(Double side, Double angle) {
        if(side == null || angle == null)
            return null;

        return new Diamond(side, angle);
    }
}
