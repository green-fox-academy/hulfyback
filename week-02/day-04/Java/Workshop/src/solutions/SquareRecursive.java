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



  public static void mainDraw(Graphics graphics){

  }
  // Don't touch the code below


  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}

