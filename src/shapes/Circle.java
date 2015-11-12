package shapes;

import java.awt.Graphics;

public class Circle extends Shape {

    @Override
    public void draw(Graphics g) {
        //System.out.println("draw cirle");
        g.drawOval(100,100,100,100);
    }
}
