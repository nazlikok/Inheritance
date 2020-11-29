package com.company;

public class Main2 {
    static String[] Colors = {"Red", "Green", "Yellow", "Blue", "Purple", "Cyan", "Orange", "Brown", "White", "Black"};
    static int totalNum = 10;
    static int max = 100;
    static int min = 1;

    public static void main(String[] args) {

        for(int i=0; i<totalNum; i++){
            int randShapeNum=(int) (Math.random() * 3);
            Shape testShape;

            int randColor = (int) (Math.random() * Colors.length);
            String color= Colors[randColor];

            if(randShapeNum==0){
                testShape= prepareCircle(i,color);

            }else if(randShapeNum==1){
                testShape= prepareTriangle(i,color);
            }else{
                testShape= prepareRectangle(i,color);
            }
            testShape.print();

        }
    }

    static Circle prepareCircle(int index,String color){
        Circle testCircle = new Circle();
        //Name
        testCircle.name = "Circle-" + String.format("%03d", index);
        //Center
        int randX = (int) (Math.random() * (max - min)) + min;
        int randY = (int) (Math.random() * (max - min)) + min;
        Point circleCenter = new Point();
        circleCenter.pointX = randX;
        circleCenter.pointY = randY;
        testCircle.center = circleCenter;
        //Radius
        testCircle.radius = (int) (Math.random() * (max / 4));
        //Color
        testCircle.color=color;
        return testCircle;

    }

    static Triangle prepareTriangle(int index,String color){
        Triangle testTriangle = new Triangle();
        //Name
        testTriangle.name = "Triangle-" + String.format("%03d", index);
        //height
        testTriangle.height = (int) (Math.random() * (max / 4));
        //a
        testTriangle.a = (int) (Math.random() * (max / 4));
        //base
        testTriangle.base = (int) (Math.random() * (max / 4));
        //c
        testTriangle.c = (int) (Math.random() * (max / 4));
        //Color
        testTriangle.color=color;
        return testTriangle;
    }

    static Rectangle prepareRectangle(int index,String color){
        Rectangle testRectangle = new Rectangle();
        //Name
        testRectangle.name = "Rectangle-" + String.format("%03d", index);
        //height
        testRectangle.height = (int) (Math.random() * (max / 4));
        //base
        testRectangle.base = (int) (Math.random() * (max / 4));
        //Color
        testRectangle.color=color;
        return testRectangle;
    }
}
