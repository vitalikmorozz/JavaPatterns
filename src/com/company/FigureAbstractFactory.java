package com.company;

public class FigureAbstractFactory {
    public static IFigure create(Double sideA, Double sideB, Double angle) {
        if(sideA.equals(sideB) && angle == Math.PI / 2) return SquareFactory.create(sideA);
        if(sideA.equals(sideB) && angle != Math.PI / 2) return DiamondFactory.create(sideA, angle);
        if(!sideA.equals(sideB) && angle == Math.PI / 2) return RectangleFactory.create(sideA, sideB);
        if(!sideA.equals(sideB) && angle != Math.PI / 2) return ParallelogramFactory.create(sideA, sideB, angle);

        return null;
    }

    public static IFigure create(Double side, Double angle) {
        if(angle == Math.PI / 2) return SquareFactory.create(side);
        if(angle != Math.PI / 2) return DiamondFactory.create(side, angle);

        return null;
    }

}
