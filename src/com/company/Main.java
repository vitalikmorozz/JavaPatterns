package com.company;

public class Main {

    public static void main(String[] args) {
//	    IFigure figure = FigureAbstractFactory.create(4.0, 5.0, Math.PI / 4);
//        System.out.println(figure.toString());
//        figure = FigureAbstractFactory.create(4.0, 4.0, Math.PI / 2);
//        System.out.println(figure.toString());
//        figure = FigureAbstractFactory.create(4.0, 4.0, Math.PI / 3);
//        System.out.println(figure.toString());
//        figure = FigureAbstractFactory.create(4.0, 5.0, Math.PI / 2);
//        System.out.println(figure.toString());

        Rectangle rectangle = new Rectangle.Builder().setSideA(4.0).setSideB(2.0).build();
        Square square = new Square.Builder().setSide(3.0).build();
        Parallelogram parallelogram = new Parallelogram.Builder().setSideA(2.5).setSideB(5.7).setAngle(Math.PI/6).build();
        Diamond diamond = new Diamond.Builder().setSide(5.0).setAngle(Math.PI/4).build();

        System.out.println(rectangle.toString());
        System.out.println(square.toString());
        System.out.println(parallelogram.toString());
        System.out.println(diamond.toString());
    }
}
