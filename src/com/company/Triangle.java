package com.company;

public class Triangle extends Shape{

    float height;
    float a;
    float base;
    float c;
    @Override
    public float area() {
        return base*height/2;
    }

    @Override
    public float circumference() {
        return base + a + c;
    }

    @Override
    public void print() {
        System.out.print(name);
        System.out.print("\tHeight: "+ height);
        System.out.print("\ta: "+ a);
        System.out.print("\tBase: "+ base);
        System.out.print("\tc: "+ c);
        System.out.print("\tColor: "+ color);
        System.out.print("\tArea: "+area());
        System.out.print("\tCircumference: "+ circumference());
    }

}
