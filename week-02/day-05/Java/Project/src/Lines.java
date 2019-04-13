import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Lines {
  private static final int WIDTH = 320;
  private static final int HEIGHT = 320;

  public static void main(String[] args) {
    createFrame();
  }

  public static void createFrame(){
    JFrame jFrame = new JFrame("Lines");
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    ImagePanel panel = new ImagePanel();
    panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    jFrame.add(panel);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    jFrame.pack();
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
//      drawLines(50, 20, graphics);
      drawLinesRecursively(50, 50, 20, graphics);
    }
  }

  public static void drawLines(int x, int steps, Graphics g) {
    for (int i = x; i <= WIDTH; i += steps) {
      g.setColor(new Color (128, 0, 128));
      g.drawLine(i, 0, WIDTH, i - steps);
      g.setColor(Color.GREEN);
      g.drawLine(0, i, i - steps, HEIGHT);
    }
  }

  public static void drawLinesRecursively(int x, int i, int steps, Graphics g) {
    g.setColor(new Color (128, 0, 128));
    g.drawLine(i, 0, WIDTH, i - steps);
    g.setColor(Color.GREEN);
    g.drawLine(0, i, i - steps, HEIGHT);
    if (i < WIDTH) {
      drawLinesRecursively(x, i + steps, steps, g);
    }
  }
}