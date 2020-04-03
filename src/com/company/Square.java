package com.company;

public class Square implements IFigure {
    private Double side;

    public Square() {
    }

    Square(Double side) {
        this.side = side;
    }

    public Double getSide() {
        return side;
    }

    public void setSide(Double side) {
        this.side = side;
    }

    @Override
    public Double getPerimeter() {
        return this.side * 4;
    }

    @Override
    public Double getArea() {
        return this.side * this.side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    public static class Builder {
        private Square squareBuilder;

        public Builder() {
            this.squareBuilder = new Square();
        }

        public Builder setToSimilarTo(Square square) {
            this.squareBuilder.setSide(square.side);
            return this;
        }

        public Builder setSide(Double side) {
            this.squareBuilder.setSide(side);
            return this;
        }

        public Square build() {
            return squareBuilder;
        }
    }
}
