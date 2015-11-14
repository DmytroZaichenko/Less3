package constructors;


public class RoundGlyph extends Glyph {

    private int radius = 5;
    private String s = "new value";

    public RoundGlyph(int radius) {
        System.out.println("RoundGlyph#constructor");
        draw();
        this.radius = radius;
    }

    @Override
    public void draw() {
        s.length();
        System.out.println("RoundGlyph#draw()");
        System.out.println("RoundGlyph [radius: " + radius + "]");
    }
}
