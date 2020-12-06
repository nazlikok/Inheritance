package com.company;

public class Main {
    static String[] Colors = {"Red", "Green", "Yellow", "Blue", "Purple", "Cyan", "Orange", "Brown", "White", "Black"};
    static int totalNum = 100;
    static int max = 100;
    static int min = 1;
    static String[] WrongNames ={"Circle-008","Rectangle-021","Triangle-012"};

    public static void main(String[] args) {
        float sumAreas=0;
        int[] countColor = new int[Colors.length];
        float largestCircumference =0;
        Shape largestCircumferenceShape=null;
        Shape[] allShapes = new Shape[totalNum];

        for(int i=0; i<totalNum; i++){

            int randShapeNum=(int) (Math.random() * 3);
            Shape testShape;

            int randColor = (int) (Math.random() * (Colors.length + 1));
            try {
                checkColor(randColor);
            } catch (UnknownColorException e) {
                System.out.println("Color corrected to RED");
                randColor = 0;
            }
            String color= Colors[randColor];

            if(randShapeNum==0){
                testShape= prepareCircle(i,color);
            }else if(randShapeNum==1){
                testShape= prepareTriangle(i,color);
            }else{
                testShape= prepareRectangle(i,color);
            }

            try{
                checkName(testShape.name);
            }catch (WrongNameException e){
                e.printStackTrace();
                testShape.name= testShape.name+"-Corrected";
            }

            countColor[randColor] = countColor[randColor] + 1;
            if(testShape.circumference()>largestCircumference){
                largestCircumference= testShape.circumference();
                largestCircumferenceShape=testShape;
            }

            sumAreas= sumAreas+ testShape.area();
            testShape.print();
            allShapes[i] = testShape;
        }
        float averageArea=sumAreas/totalNum;
        System.out.println("Average Area:" +averageArea);
        System.out.println("Sum Area: "+sumAreas);
        if(largestCircumferenceShape != null){
            System.out.println("Largest Circumference: "+ largestCircumference + " with name: "+ largestCircumferenceShape.name);
        }

        for(int i=0; i<Colors.length; i++){
            System.out.println(Colors[i] + ":" + countColor[i]);
        }
        System.out.println();

        Shape[] redShapes= new Shape[countColor[0]];
        int redIndex = 0;
        for (int i = 0; i < allShapes.length; i++) {
            if (allShapes[i].color.equals("Red")) {
                redShapes[redIndex] = allShapes[i];
                redIndex++;
            }
        }

        if(redShapes.length!=0){
            sortShapeArray(redShapes);
            System.out.println("Sorted Red Shapes By Area");
            for (int i = 0; i < redShapes.length; i++) {
                redShapes[i].print();
            }
        }
    }

    static void checkColor(int randColor) throws UnknownColorException {
        if (randColor == Colors.length){
            throw new UnknownColorException();
        }
    }
    public static void checkName(String name){
        for(int i=0; i< WrongNames.length; i++){
            if(name.equals(WrongNames[i])){
                throw new WrongNameException();
            }
        }
    }


    static Circle prepareCircle(int index,String color){
        Circle testCircle = new Circle();
        //Name
        testCircle.name = "Circle-" + String.format("%03d", index+1);
        //Center
        int randX = (int) (Math.random() * (max - min)) + min;
        int randY = (int) (Math.random() * (max - min)) + min;
        Point circleCenter = new Point();
        circleCenter.pointX = randX;
        circleCenter.pointY = randY;
        testCircle.center = circleCenter;
        //Radius
        testCircle.radius = (float) (Math.random() * (max/4));
        //Color
        testCircle.color=color;
        return testCircle;

    }

    static Triangle prepareTriangle(int index,String color){
        Triangle testTriangle = new Triangle();
        //Name
        testTriangle.name = "Triangle-" + String.format("%03d", index+1);
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
        testRectangle.name = "Rectangle-" + String.format("%03d", index+1);
        //height
        testRectangle.height = (int) (Math.random() * (max / 4));
        //base
        testRectangle.base = (int) (Math.random() * (max / 4));
        //Color
        testRectangle.color=color;
        return testRectangle;
    }

    static void sortShapeArray(Shape[] shapes) {
        //bubble sort
        int n = shapes.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (shapes[j].area() > shapes[j + 1].area()) {
                    Shape temp = shapes[j];
                    shapes[j] = shapes[j + 1];
                    shapes[j + 1] = temp;
                }
            }
        }
    }
}