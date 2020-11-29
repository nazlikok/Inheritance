
package com.company;

public class Shapes {
    String shapesColor;
    String shapesName;
    float area;
    float circumference;

    static class Circles extends Shapes{
        int radius;
        Point center;
    }

    static class Triangles extends Shapes{
        int height;
        int base;
    }

    static class Rectangles extends Shapes{
        int height;
        int base;
    }
}
