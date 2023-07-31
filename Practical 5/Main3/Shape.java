package com.exepmycompany.main3;
public abstract class Shape 
{
    public double area;
    public abstract double calculatearea();
    
    public void display()
    {
        System.out.println(+area);
    }
}
