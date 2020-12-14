

package com.company;

import static com.company.Main.WrongNames;

public abstract class Shape {
    String color;
    String name;
    public abstract float area();
    public abstract float circumference();
    public abstract void print();

    public void checkName () throws WrongNameException {
        for(int i=0; i< WrongNames.length; i++){
            if(name.equals(WrongNames[i])){
                throw new WrongNameException();
            }
        }
    }

}
