package solutions;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SquareRecursive {
  private static final int WIDTH = 729;
  private static final int HEIGHT = 729;
  private static final double SCALE = 0.3;

  public static void main(String[] args) {
    createFrame();
  }

  public static void createFrame(){
    JFrame jFrame = new JFrame("Drawing");
    ImagePanel panel = new ImagePanel();
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    panel.setBackground(Color.YELLOW);
    jFrame.add(panel);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    jFrame.pack();
  }

  public static void drawSquare(int x, int y, int size, Graphics graphics) {
    graphics.setColor(Color.BLACK);
    graphics.drawRect(x, y, size, size);

    if (size > 5) {
      drawSquare( x + (int) (x * SCALE), y - (int) (y * SCALE), (int) (size * SCALE), graphics);
    }
  }

  public static void mainDraw(Graphics graphics){
    drawSquare((int) (WIDTH * SCALE), (int) (HEIGHT * SCALE), (int) (WIDTH * SCALE), graphics);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}