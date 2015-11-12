package shapes;

import java.awt.*;

public class Triangle extends Shape {
    public Triangle() {
    }

    @Override
    protected void draw(Graphics g) {
        System.out.println("draw triangle");
    }
}
