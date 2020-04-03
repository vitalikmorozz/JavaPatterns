package com.company;

public class Rectangle implements IFigure {
    private Double sideA;
    private Double sideB;

    public Rectangle() {
    }

    public Rectangle(Double sideA, Double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Double getSideA() {
        return sideA;
    }

    public void setSideA(Double sideA) {
        this.sideA = sideA;
    }

    public Double getSideB() {
        return sideB;
    }

    public void setSideB(Double sideB) {
        this.sideB = sideB;
    }

    @Override
    public Double getPerimeter() {
        return null;
    }

    @Override
    public Double getArea() {
        return null;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }

    public static class Builder {
        private Rectangle rectangleBuilder;

        public Builder() {
            this.rectangleBuilder = new Rectangle();
        }

        public Builder setToSimilarTo(Rectangle rectangle) {
            this.rectangleBuilder.setSideA(rectangle.sideA);
            this.rectangleBuilder.setSideB(rectangle.sideB);
            return this;
        }

        public Builder setSideA(Double sideA) {
            this.rectangleBuilder.setSideA(sideA);
            return this;
        }

        public Builder setSideB(Double sideB) {
            this.rectangleBuilder.setSideB(sideB);
            return this;
        }

        public Rectangle build() {
            return rectangleBuilder;
        }
    }
}
