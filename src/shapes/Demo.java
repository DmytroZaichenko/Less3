package shapes;

public class Demo {

    public static void main(String[] args) {

        Drawable[] shapes = new Drawable[]{
                new Circle()
                ,new Rectangle()
                ,new Triangle()
                ,new Square()
        };
        new ShapesTemplate(shapes);

    }

}
