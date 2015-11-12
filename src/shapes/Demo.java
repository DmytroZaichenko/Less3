package shapes;

public class Demo {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];

        Circle c = new Circle();
        shapes[0] = c;
        ShapesTemplate st = new ShapesTemplate(shapes);

    }

}
