package shapes;

import java.awt.*;

public class Triangle extends AbstractShape {
    public Triangle() {
    }

    @Override
    public void draw(Graphics g) {

        int xpoints[] = {150, 200, 150};
        int ypoints[] = {150, 150, 200};
        int npoints = 3;

        g.setColor(Color.GREEN);
        g.fillPolygon(xpoints,ypoints,npoints);
    }
}
