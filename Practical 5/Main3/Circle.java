package com.exepmycompany.main3;
public class Circle extends Shape
{
    private double radius;
    public void circle(double radius)
    {
        this.radius=radius;
    }
    @Override
    public double calculatearea()
    {
        area=2*Math.PI*radius;
        return area;
    }
}
