package shapes;

import javax.swing.*;
import java.awt.*;

public class Circle extends Shape {

    @Override
    public void draw(Graphics g) {

        g.setColor(Color.darkGray);
        g.fillOval(100,100,100,100);
        g.drawOval(100, 100, 100, 100);

    }

}
