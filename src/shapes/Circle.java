package shapes;

import javax.swing.*;
import java.awt.*;

public class Circle extends Shape {

    @Override
    public void draw(Graphics g) {

        Graphics2D graphics2D = (Graphics2D) g;
        graphics2D.setStroke(new BasicStroke(5));

        g.setColor(Color.YELLOW);
        g.fillOval(210,210,100,100);
        //g.drawOval(100, 100, 100, 100);

    }

}
