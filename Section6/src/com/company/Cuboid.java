package com.company;

public class Cuboid extends Rectangle{
    private double height;

    public double getHeight() {
        return height;
    }

    public Cuboid(double width, double length, double height){
        super(width,length);
        if(height >= 0)
            this.height = height;
        else
            this.height = 0;
    }

    public double getVolume()
    {
        return getArea() * height;
    }
}
