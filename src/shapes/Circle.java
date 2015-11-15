package shapes;

import java.awt.*;

public class Circle extends AbstractShape {

    public Circle() {
        color = Color.YELLOW;
    }

    @Override
    public void draw(Graphics g) {

        Graphics2D graphics2D = (Graphics2D) g;
        graphics2D.setStroke(new BasicStroke(5));

        g.setColor(color);
        g.fillOval(210,210,100,100);
    }



}
