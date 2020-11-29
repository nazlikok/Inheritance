package com.company;

public class Circle extends Shape {
    int radius;
    Point center;
    @Override
    public float area() {
        return (float) Math.PI* radius*radius;
    }

    @Override
    public float circumference() {
        return (float) (Math.PI*2*radius);
    }
    @Override
    public void print() {
        System.out.print(name);
        System.out.print("\t\tCenter: (" + center.pointX + "," + center.pointY + ")");
        System.out.print("\t\t\tRadius: "+ radius);
        System.out.print("\t\tColor: "+ color);
        System.out.print("\t\t\tArea: "+area());
        System.out.print("\t\t\tCircumference: "+ circumference());
        System.out.println();
    }
}
