package shapes;

import java.awt.Graphics;

public class Triangle extends Shape {
    public Triangle() {
    }

    @Override
    public void draw(Graphics g) {
        System.out.println("draw triangle");
    }
}
