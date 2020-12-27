package com.los.shapes;

public class Triangle {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;

    public Triangle() {
        this(0, 0, 1, 0, 0, 1);
    }

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.setX1(x1);
        this.setY1(y1);
        this.setX2(x2);
        this.setY2(y2);
        this.setX3(x3);
        this.setY3(y3);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return triangle.getX1() == getX1() &&
                triangle.getY1() == getY1() &&
                triangle.getX2() == getX2() &&
                triangle.getY2() == getY2() &&
                triangle.getX3() == getX3() &&
                triangle.getY3() == getY3();
    }

    @Override
    public String toString() {
        return String.format("Triangle{(%.1f, %.1f), (%.1f, %.1f), (%.1f, %.1f)}",
                getX1(), getY1(), getX2(), getY2(), getX3(), getY3());
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public double getX3() {
        return x3;
    }

    public void setX3(double x3) {
        this.x3 = x3;
    }

    public double getY3() {
        return y3;
    }

    public void setY3(double y3) {
        this.y3 = y3;
    }
}
