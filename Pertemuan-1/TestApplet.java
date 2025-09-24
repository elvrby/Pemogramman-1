import javax.swing.*;
import java.awt.*;

public class TestApplet extends JFrame {
    public TestApplet() {
        setTitle("Program Java dengan Swing");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new DrawingPanel());

        setVisible(true);
    }

    static class DrawingPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawString("Membuat program java dengan JFrame :) ", 25, 25);
            g.setColor(Color.red);
            g.drawString("Membuat program java sangat menyenangkan ! :) ", 25, 45);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TestApplet::new);
    }
}
