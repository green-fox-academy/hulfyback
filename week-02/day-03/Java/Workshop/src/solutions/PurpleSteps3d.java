package solutions;

import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3d {
  private static final int WIDTH = 320;
  private static final int HEIGHT = 320;
  private static final int X_COORD = 10;
  private static final int Y_COORD = 10;
  private static final int SIZE = 10;
  private static final int MAXSIZE = 60;

  public static void main(String[] args) {
    createFrame();
  }

  public static void createFrame(){
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    ImagePanel panel = new ImagePanel();
    panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    jFrame.add(panel);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    jFrame.pack();
  }

  public static void drawPurpleSteps(int x, int y, int size, Graphics graphics) {
    graphics.setColor(new Color(128, 0, 128));

    for (int i = SIZE; i < MAXSIZE ; i += SIZE) {
    graphics.fill3DRect(x, y, i, i, true);
    x += i;
    y += i;
    }
  }

  public static void drawStepsRecursively(int x, int y, int size, Graphics graphics) {
    graphics.setColor(new Color(128, 0, 128));

    graphics.fill3DRect(x, y, size, size, true);
    if (size < MAXSIZE) {
      drawStepsRecursively(x + size, y + size, size + 10, graphics);
    }
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      drawPurpleSteps(X_COORD, Y_COORD, SIZE, graphics);
      drawStepsRecursively(X_COORD, Y_COORD, SIZE, graphics);
    }
  }
}
