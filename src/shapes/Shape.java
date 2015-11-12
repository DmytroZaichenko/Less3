package shapes;

import java.awt.*;

public class Shape {

    protected void draw(Graphics g){
        throw new IllegalComponentStateException("I don't know how to paint this shape. Please override me!");
    }

    public int newMethod(){
        return 3*9;
    }

}
