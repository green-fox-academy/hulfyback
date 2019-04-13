import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class DrawingFrame {
  public static void createFrame(int width, int height, String title, JPanel panel){
    JFrame jFrame = new JFrame(title);
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
//    ImagePanel panel = new ImagePanel();
    panel.setPreferredSize(new Dimension(width, height));
    jFrame.add(panel);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    jFrame.pack();
  }
}
