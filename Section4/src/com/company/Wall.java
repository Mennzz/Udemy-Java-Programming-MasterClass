package com.company;

public class Wall {
    private double height;
    private double width;

    public Wall() {
    }

    public Wall(double height, double width) {
       setWidth(width);
       setHeight(height);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height< 0)
            this.height = 0;
        else
            this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width< 0)
            this.width= 0;
        else
            this.width= width;
    }
    public double getArea()
    {
        return this.width * this.height;
    }
}
