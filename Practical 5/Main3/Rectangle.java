package com.exepmycompany.main3;
public class Rectangle extends Shape
{
    private int width,height;
    public void Rec(int width,int height)
    {
        this.width=width;
        this.height=height;
    }
    @Override
    public double calculatearea()
    {
        area=width*height;
        return area;
    }
}
