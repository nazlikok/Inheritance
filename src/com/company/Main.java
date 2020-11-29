/*
package com.company;

public class Main {
    static String[] Colors = {"Red", "Green", "Yellow", "Blue", "Purple", "Cyan", "Orange", "Brown", "White", "Black"};

    public static void main(String[] args) {

        int totalNum = 100;
        int max = 100;
        int min = 1;
        float sumCircle=0;
        float sumTriangle=0;
        float sumRectangle=0;

        int circleCount = (int) (Math.random() *(max - min));
        int triangleCount = (int)(Math.random()*(max-circleCount-min));
        int left= totalNum-circleCount;
        int rectangleCount = left-triangleCount;

        System.out.println("Circle count is:"+ circleCount + "  Triangle count is:"+ triangleCount + "  Rectangle count is:"+ rectangleCount);
        System.out.println();
        int countCircleColors[] = new int[Colors.length];
        int countTriangleColors[] = new int[Colors.length];
        int countRectangleColors[] = new int[Colors.length];

        //CIRCLE
        for (int i=1; i<=circleCount; i++){
            Shapes.Circles testCircle = new Shapes.Circles();

            //Name
            testCircle.shapesName = "Circle-" + String.format("%03d", i);
            System.out.println(testCircle.shapesName);

            //Center
            int randX = (int) (Math.random() * (max - min)) + min;
            int randY = (int) (Math.random() * (max - min)) + min;
            Point circleCenter = new Point();
            circleCenter.pointX = randX;
            circleCenter.pointY = randY;
            testCircle.center = circleCenter;
            System.out.println("Center: (" + circleCenter.pointX + "," + circleCenter.pointY + ")");

            //Radius
            testCircle.radius = (int) (Math.random() * (max / 4));
            System.out.println("Radius: "+ testCircle.radius);

            //Color
            int randColor = (int) (Math.random() * Colors.length);
            testCircle.shapesColor = Colors[randColor];
            System.out.println("Color : " + testCircle.shapesColor);
            countCircleColors[randColor] = countCircleColors[randColor] + 1;

            //Area
            testCircle.area = (float) Math.PI* testCircle.radius* testCircle.radius;
            System.out.println("Area : " + testCircle.area);
            float add= (float)testCircle.area;
            sumCircle =  sumCircle + add;

            //Circumference
            testCircle.circumference=(float)Math.PI*2*testCircle.radius;
            System.out.println("Circumference: "+ testCircle.circumference);

            System.out.println();
        }
        System.out.println("Sum of Circle Areas: "+ sumCircle);
        System.out.println("Average Area:"+ sumCircle/circleCount);
        for (int i = 0; i < countCircleColors.length; i++) {
            System.out.println(Colors[i] + " =" + countCircleColors[i]);
        }
        System.out.println();


        //TRIANGLE
        for (int i=1; i<=triangleCount; i++){
            Shapes.Triangles testTriangle = new Shapes.Triangles();

            //Name
            testTriangle.shapesName = "Triangle-" + String.format("%03d", i);
            System.out.println(testTriangle.shapesName);

            //height
            testTriangle.height = (int) (Math.random() * (max / 4));
            System.out.println("Height: "+ testTriangle.height);

            //base
            testTriangle.base = (int) (Math.random() * (max / 4));
            System.out.println("Base: "+ testTriangle.base);

            //Color
            int randColor = (int) (Math.random() * Colors.length);
            testTriangle.shapesColor = Colors[randColor];
            System.out.println("Color : " + testTriangle.shapesColor);
            countTriangleColors[randColor] = countTriangleColors[randColor] + 1;

            //Area
            testTriangle.area = (float) testTriangle.base* testTriangle.height/2;
            System.out.println("Area : " + testTriangle.area);
            float add= (float)testTriangle.area;
            sumTriangle =  sumTriangle + add;

            //Perimeter
            System.out.println();
        }
        System.out.println("Sum of Triangle Areas: "+ sumTriangle);
        System.out.println("Average Area:"+ sumTriangle/triangleCount);
        for (int i = 0; i < countTriangleColors.length; i++) {
            System.out.println(Colors[i] + " =" + countTriangleColors[i]);
        }
        System.out.println();


        //RECTANGLE
        for (int i=1; i<=rectangleCount; i++){
            Shapes.Rectangles testRectangle = new Shapes.Rectangles();

            //Name
            testRectangle.shapesName = "Rectangle-" + String.format("%03d", i);
            System.out.println(testRectangle.shapesName);

            //height
            testRectangle.height = (int) (Math.random() * (max / 4));
            System.out.println("Height: "+ testRectangle.height);

            //base
            testRectangle.base = (int) (Math.random() * (max / 4));
            System.out.println("Base: "+ testRectangle.base);

            //Color
            int randColor = (int) (Math.random() * Colors.length);
            testRectangle.shapesColor = Colors[randColor];
            System.out.println("Color : " + testRectangle.shapesColor);
            countRectangleColors[randColor] = countRectangleColors[randColor] + 1;

            //Area
            testRectangle.area = (float) testRectangle.base* testRectangle.height;
            System.out.println("Area : " + testRectangle.area);
            float add= (float)testRectangle.area;
            sumRectangle =  sumRectangle + add;

            //Perimeter
            testRectangle.circumference=(float)(2*testRectangle.base)+(2*testRectangle.height);
            System.out.println("Circumference: "+ testRectangle.circumference);

            System.out.println();
        }
        System.out.println("Sum of Rectangle Areas: "+ sumRectangle);
        System.out.println("Average Area:"+ sumRectangle/rectangleCount);
        for (int i = 0; i < countRectangleColors.length; i++) {
            System.out.println(Colors[i] + " =" + countRectangleColors[i]);
        }
        System.out.println();


    }
}
*/
