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
        System.out.print("\t\t\ta: "+ a);
        System.out.print("\t\tBase: "+ base);
        System.out.print("\t\tc: "+ c);
        System.out.print("\t\tColor: "+ color);
        System.out.print("\t\tArea: "+area());
        System.out.print("\t\tCircumference: "+ circumference());
        System.out.println();
    }

}
