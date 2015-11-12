package shapes;

import java.awt.*;

public class Rectangle extends Shape {

    @Override
    public void draw(Graphics g)
    {

        g.setColor(Color.GREEN);
        g.fillRect(200,100,100,60);


    }
}
