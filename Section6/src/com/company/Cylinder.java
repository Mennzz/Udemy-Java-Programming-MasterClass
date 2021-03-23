package com.company;

public class Cylinder extends Circle{
    private double height;

    public double getHeight() {
        return height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        if(height >= 0)
            this.height = height;
        else
            this.height = 0;
    }

    public double getVolume()
    {
        double area = getArea();
        return area * height;
    }
}
