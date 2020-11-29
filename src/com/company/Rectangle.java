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
        System.out.print("\t\tHeight: "+ height);
        System.out.print("\t\tBase: "+ base);
        System.out.print("\t\tColor: "+ color);
        System.out.print("\t\tArea: "+area());
        System.out.print("\t\tCircumference: "+ circumference());
        System.out.println();
    }
}
