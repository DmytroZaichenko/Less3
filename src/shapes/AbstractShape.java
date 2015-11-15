package shapes;

import java.awt.Color;

public abstract class AbstractShape implements Drawable {

    protected int countOfAngle;
    protected Color color;

    public Color getColor() {
        return color;
    }

    public void printCountOfAngle(){
        System.out.println("Count of angle of this shape is "+getCountOfAngle());

    }

    public int getCountOfAngle(){
        return this.countOfAngle;
    }

    public void setCountOfAngle(int countOfAngle) {
        this.countOfAngle = countOfAngle;
    }
}
