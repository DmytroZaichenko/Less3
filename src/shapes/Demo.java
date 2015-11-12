package shapes;

/**
 * Created by DmitryZ on 12.11.2015.
 */
public class Demo {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];

        Circle c = new Circle();
        shapes[0] = c;
        ShapesTemplate st = new ShapesTemplate(shapes);

    }

}
