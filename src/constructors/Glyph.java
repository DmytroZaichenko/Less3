package constructors;


public class Glyph {

    public Glyph() {
        System.out.println("Glyph#constructor");
        draw();
        throw null;
    }

    public void draw(){
        System.out.println("Glyph#draw()");
    }
}
