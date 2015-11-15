package shapes;

public class DemoShapes {

    public static void main(String[] args) {

        Circle circle = new Circle();
        Drawable[] shapes = new Drawable[]{
                circle
                ,new Rectangle()
                ,new Triangle()
                ,new Square()
        };
        new ShapesTemplate(shapes);

        circle.printCountOfAngle();

    }

}
