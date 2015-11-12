package shapes;

import java.awt.*;

/**
 * Created by DmitryZ on 12.11.2015.
 */
public class Rectangle extends Shape {

    @Override
    public void draw(Graphics g)
    {

        g.setColor(Color.white);
        g.fillRect(200,100,100,100);


    }
}
