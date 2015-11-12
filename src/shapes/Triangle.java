package shapes;

import java.awt.*;

public class Triangle extends Shape {
    public Triangle() {
    }

    @Override
    public void draw(Graphics g) {

        int xpoints[] = {25, 145, 25, 145, 25};
        int ypoints[] = {25, 25, 145, 145, 25};
        int npoints = 3;

        g.setColor(Color.BLUE);
        g.fillPolygon(xpoints,ypoints,npoints);
    }
}
