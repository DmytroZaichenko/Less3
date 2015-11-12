package shapes;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class ShapesTemplate extends JPanel {

    private Shape[] shapes;

    public ShapesTemplate(Shape[] shapes) {
        this.shapes = shapes;
        if (shapes == null || shapes.length < 1){
            this.shapes = new Shape[0];
        }

        JFrame frame = new JFrame("BATTLE FIELD, DAY 3");
        frame.setLocation(75,150);
        frame.setMinimumSize(new Dimension(600, 400));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(this);
        frame.pack();
        frame.setVisible(true);

        repaint();

    }

    @Override
    public void paintComponents(Graphics g) {
        for (Shape s : shapes){
            s.draw(g);
        }
    }



}
