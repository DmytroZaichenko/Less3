package shapes;

import java.awt.*;

/**
 * Created by admin on 12.11.2015.
 */
public class Square extends Rectangle {

    public Square() {
    }

    @Override
    public void draw(Graphics g) {
        super.draw(g);
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(500,100,30,30);

    }
}
