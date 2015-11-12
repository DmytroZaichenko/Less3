package shapes;

import java.awt.*;

public class Circle extends Shape {

    @Override
    protected void draw(Graphics g) {
        //System.out.println("draw cirle");
        g.drawOval(10,10,15,13);
    }
}
