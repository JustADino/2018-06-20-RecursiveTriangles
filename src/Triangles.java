import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class Triangles {
    private JFrame frame;
    private Screen screen;

    public Triangles() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        screen = new Screen();
        screen.setPreferredSize(new Dimension(600,500));
        screen.addComponentListener(new ComponentListener() {
            @Override
            public void componentResized(ComponentEvent e) {
                screen.repaint();
            }

            @Override
            public void componentMoved(ComponentEvent e) {

            }

            @Override
            public void componentShown(ComponentEvent e) {

            }

            @Override
            public void componentHidden(ComponentEvent e) {

            }

        });
        frame.add(screen);
        frame.pack();
        frame.setVisible(true);
        screen.repaint();

    }

    public static void main(String[] args) {
        new Triangles();
    }

}
