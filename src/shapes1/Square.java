package shapes1;

import shapes.*;

import java.awt.*;


public class Square extends Rectangle implements Drawable {

    public Square() {
    }

    @Override
    public void draw(Graphics g) {
        setXpoint(new int[] {25 ,100,100,25});
        setYpoint(new int[] {100,100,25 ,25});
        setNpoint(4);
        setColor(Color.ORANGE);

        super.draw(g);
    }
}
