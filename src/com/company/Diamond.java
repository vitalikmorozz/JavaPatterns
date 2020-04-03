package com.company;

public class Diamond implements IFigure {
    private Double side;
    private Double angle;

    public Diamond() {
    }

    Diamond(Double side, Double angle) {
        this.side = side;
        this.angle = angle;
    }

    public Double getSide() {
        return side;
    }

    public void setSide(Double side) {
        this.side = side;
    }

    public Double getAngle() {
        return angle;
    }

    public void setAngle(Double angle) {
        this.angle = angle;
    }

    @Override
    public Double getPerimeter() {
        return this.side * 4;
    }

    @Override
    public Double getArea() {
        return Math.pow(this.side, 2) * Math.sin(this.angle);
    }

    @Override
    public String toString() {
        return "Diamond{" +
                "side=" + side +
                ", angle=" + angle +
                '}';
    }

    public static class Builder {
        private Diamond diamondBuilder;

        public Builder() {
            this.diamondBuilder = new Diamond();
        }

        public Builder setSimilarTo(Diamond diamond) {
            this.diamondBuilder.setSide(diamond.side);
            this.diamondBuilder.setAngle(diamond.angle);
            return this;
        }

        public Builder setAngle(Double angle) {
            this.diamondBuilder.setAngle(angle);
            return this;
        }

        public Builder setSide(Double side) {
            this.diamondBuilder.setSide(side);
            return this;
        }

        public Diamond build() {
            return this.diamondBuilder;
        }
    }
}
