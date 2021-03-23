package com.company;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    //between this point and origin
    public double distance()
    {
        return Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2));
    }
    public double distance(int x1,int y1)
    {
        return Math.sqrt(Math.pow(this.x-x1,2)+Math.pow(this.y-y1,2));
    }
    public double distance (Point p)
    {
        return Math.sqrt(Math.pow(this.x-p.x,2)+Math.pow(this.y-p.y,2));
    }
}
