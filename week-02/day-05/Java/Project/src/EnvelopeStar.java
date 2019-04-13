import java.awt.*;
import javax.swing.*;

public class EnvelopeStar extends JPanel{
  @Override
  protected void paintComponent(Graphics graphics) {
    super.paintComponent(graphics);
    drawEnvelopeStarRecursively(160, 160, 0, 10, graphics);
  }

  private static void drawEnvelopeStarRecursively(int x, int y, int i, int steps, Graphics g) {
    g.setColor(Color.GREEN);
    g.drawLine(x, i, x + i, y);
    g.drawLine(2 * x - i, y, x, y + i );
    g.drawLine(x, 2 * y - i, x - i, y );
    g.drawLine(i, y, x, y - i);
    if (i < x) {
      drawEnvelopeStarRecursively(x, y, i + steps, steps, g);
    }
  }
}