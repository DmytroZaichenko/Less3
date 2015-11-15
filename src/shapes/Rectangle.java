package shapes;

import java.awt.*;

public class Rectangle extends AbstractShape {

    protected int[] xpoint = {125 ,300,300,125};
    protected int[] ypoint = {100,100,25 ,25};
    protected int   npoint = 4;
    protected Color color = Color.BLUE;

    public Rectangle() {

    }

    public void setXpoint(int[] xpoint) {
        this.xpoint = xpoint;
    }

    public void setYpoint(int[] ypoint) {
        this.ypoint = ypoint;
    }

    public void setNpoint(int npoint) {
        this.npoint = npoint;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void draw(Graphics g)
    {

        g.setColor(this.color);
        g.fillPolygon(this.xpoint,this.ypoint,this.npoint);

    }
}
