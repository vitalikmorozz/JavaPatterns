package com.company;

public class Parallelogram implements IFigure {
    private Double sideA;
    private Double sideB;
    private Double angle;

    public Parallelogram() {
    }

    Parallelogram(Double sideA, Double sideB, Double angle) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.angle = angle;
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

    public Double getAngle() {
        return angle;
    }

    public void setAngle(Double angle) {
        this.angle = angle;
    }

    @Override
    public String toString() {
        return "Parallelogram{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", angle=" + angle +
                '}';
    }

    @Override
    public Double getPerimeter() {
        return this.sideA * 2 + this.sideB * 2;
    }

    @Override
    public Double getArea() {
        return this.sideA * this.sideB * Math.sin(this.angle);
    }

    public static class Builder {
        private Parallelogram parallelogramBuilder;

        public Builder() {
            this.parallelogramBuilder = new Parallelogram();
        }

        public Builder setSimilarTo(Parallelogram parallelogram) {
            this.parallelogramBuilder.setSideA(parallelogram.sideA);
            this.parallelogramBuilder.setSideB(parallelogram.sideB);
            this.parallelogramBuilder.setAngle(parallelogram.angle);
            return this;
        }

        public Builder setSideA(Double sideA) {
            this.parallelogramBuilder.setSideA(sideA);
            return this;
        }

        public Builder setSideB(Double sideB) {
            this.parallelogramBuilder.setSideB(sideB);
            return this;
        }

        public Builder setAngle(Double angle) {
            this.parallelogramBuilder.setAngle(angle);
            return this;
        }

        public Parallelogram build() {
            return this.parallelogramBuilder;
        }
    }
}
