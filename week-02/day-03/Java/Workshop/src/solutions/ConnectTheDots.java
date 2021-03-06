package solutions;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
  public static void createPolylgon(int[][] coordinates, Graphics graphics) {
    graphics.setColor(Color.GREEN);
    int[] xCoordinates = new int[coordinates.length];
    int[] yCoordinates = new int[coordinates.length];

    for (int i = 0; i < coordinates.length ; i++) {
      xCoordinates[i] = coordinates[i][0];
      yCoordinates[i] = coordinates[i][1];
    }

    graphics.drawPolygon(xCoordinates, yCoordinates, coordinates.length);
  }

  public static void mainDraw(Graphics graphics) {
    // Create a function that takes 2 parameters:
    // An array of {x, y} points and graphics
    // and connects them with green lines.
    // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
    createPolylgon(new int[][]{{10, 10}, {290,  10}, {290, 290}, {10, 290}}, graphics);

    // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
    createPolylgon(new int[][] {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70}}, graphics);

    // {120, 100}, {85, 130}, {50, 100}}
    createPolylgon(new int[][] {{120, 100}, {85, 130}, {50, 100}}, graphics);

  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 320;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
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
      mainDraw(graphics);
    }
  }
}
