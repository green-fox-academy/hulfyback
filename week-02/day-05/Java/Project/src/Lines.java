import javax.swing.*;
import java.awt.*;

public class Lines extends JPanel {
  @Override
  protected void paintComponent(Graphics graphics) {
    super.paintComponent(graphics);
    drawLinesRecursively(320, 320, 20, 10, graphics);
  }

  private static void drawLinesRecursively(int width, int height, int i, int steps, Graphics g) {
    g.setColor(new Color (128, 0, 128));
    g.drawLine(i, 0, width, i - steps);
    g.setColor(Color.GREEN);
    g.drawLine(0, i, i - steps, height);
    if (i < width) {
      drawLinesRecursively(width, height,i + steps, steps, g);
    }
  }
}