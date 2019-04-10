package solutions;

import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

  public static int random32BitNumber() {
    return (int) (Math.random() * 256);
  }

  public static Color randomColor() {
    int red = random32BitNumber();
    int green = random32BitNumber();
    int blue = random32BitNumber();
    return new Color(red, green, blue);
    }

  public static void mainDraw(Graphics graphics){
    // draw four different size and color rectangles.
    // avoid code duplication.
    List<Color> colorList = new ArrayList<>();
    List<Integer> sizeList = new ArrayList<>();

    for (int i = 0; i < 4; i++) {

      do {
        Color randomColor = randomColor();
        if (!colorList.contains(randomColor)) {
          graphics.setColor(randomColor);
          colorList.add(randomColor);
          break;
        }
      } while (true);

      do {
        int randomSize = 10 + (int) (Math.random() * 51);
        if (!sizeList.contains(randomSize)) {
          int x = (int) (Math.random() * (WIDTH - randomSize));
          int y = (int) (Math.random() * (HEIGHT - randomSize));
          sizeList.add(randomSize);
          graphics.drawRect(x, y, randomSize, randomSize);
          break;
        }
      } while (true);
    }
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
