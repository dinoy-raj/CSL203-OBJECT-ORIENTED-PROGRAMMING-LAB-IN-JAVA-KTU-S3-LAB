import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class traffic {
  traffic() {
    JFrame T = new JFrame("Traffic light");
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();
    JPanel p4 = new JPanel();
    JPanel p5 = new JPanel();
    JPanel p6 = new JPanel();
    JPanel p7 = new JPanel();
    JRadioButton b[] = new JRadioButton[3];
    ButtonGroup bg = new ButtonGroup();
    b[0] = new JRadioButton("Start");
    b[0].setBackground(Color.WHITE);
    b[1] = new JRadioButton("WAIT");
    b[1].setBackground(Color.WHITE);
    b[2] = new JRadioButton("STOP");
    b[2].setBackground(Color.WHITE);
    bg.add(b[0]);
    bg.add(b[1]);
    bg.add(b[2]);
    p1.setBackground(Color.BLACK);
    p2.setBackground(Color.BLACK);
    p3.setBackground(Color.BLACK);
    p4.setBackground(Color.BLACK);
    p5.setBackground(Color.BLACK);
    p6.setBackground(Color.BLACK);
    p7.setBackground(Color.BLACK);
    p2.add(p4);
    p2.add(b[0]);
    p2.add(p5);
    p2.add(b[1]);
    p2.add(p6);
    p2.add(b[2]);
    p2.add(p7);
    p2.setLayout(new GridLayout(1, 7));
    T.add(p1);
    T.add(p2);
    T.add(p3);
    T.setSize(450, 300);
    T.setLayout(new GridLayout(3, 1));
    T.setVisible(true);
    T.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    b[0].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        b[0].setBackground(Color.GREEN);
        b[1].setBackground(Color.WHITE);
        b[2].setBackground(Color.WHITE);
      }
    });
    b[1].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        b[0].setBackground(Color.WHITE);
        b[1].setBackground(Color.YELLOW);
        b[2].setBackground(Color.WHITE);
      }
    });
    b[2].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        b[0].setBackground(Color.WHITE);
        b[1].setBackground(Color.WHITE);
        b[2].setBackground(Color.RED);
      }
    });
  }

  public static void main(String[] args) {
    new traffic();
  }
}
