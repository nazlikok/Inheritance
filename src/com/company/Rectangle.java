package com.company;

public class Rectangle extends Shape {
    float base;
    float height;
    @Override
    public float area() {
        return base*height;
    }

    @Override
    public float circumference() {
        return (2*base)+(2*height);
    }
    @Override
    public void print() {
        System.out.print(name);
        System.out.print("\tHeight: "+ height);
        System.out.print("\tBase: "+ base);
        System.out.print("\tColor: "+ color);
        System.out.print("\tArea: "+area());
        System.out.print("\tCircumference: "+ circumference());
    }
}
