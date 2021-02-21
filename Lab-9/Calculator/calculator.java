import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calculator {

  calculator() {

    JFrame jrm = new JFrame();
    jrm.setSize(500, 500);

    JLabel jbl = new JLabel("Calculator");
    jbl.setBounds(227, 10, 400, 30);
    jrm.add(jbl);

    JTextField jtf = new JTextField();
    jtf.setEditable(false);
    jtf.setBounds(50, 50, 400, 30);
    jrm.add(jtf);

    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bdiv, bmul, bsub, badd, bdec, beq, bdel, bclr, clear, dot;

    b1 = new JButton("1");
    b2 = new JButton("2");
    b3 = new JButton("3");
    b4 = new JButton("4");
    b5 = new JButton("5");
    b6 = new JButton("6");
    b7 = new JButton("7");
    b8 = new JButton("8");
    b9 = new JButton("9");
    b0 = new JButton("0");
    bdiv = new JButton("/");
    bmul = new JButton("*");
    bsub = new JButton("-");
    badd = new JButton("+");
    bdec = new JButton(".");
    beq = new JButton("=");
    clear = new JButton("Clear");
    dot = new JButton(".");

    b7.setBounds(90, 100, 50, 40);
    b8.setBounds(180, 100, 50, 40);
    b9.setBounds(270, 100, 50, 40);
    bdiv.setBounds(360, 100, 50, 40);

    b4.setBounds(90, 170, 50, 40);
    b5.setBounds(180, 170, 50, 40);
    b6.setBounds(270, 170, 50, 40);
    bmul.setBounds(360, 170, 50, 40);

    b1.setBounds(90, 240, 50, 40);
    b2.setBounds(180, 240, 50, 40);
    b3.setBounds(270, 240, 50, 40);
    bsub.setBounds(360, 240, 50, 40);

    bdec.setBounds(90, 310, 50, 40);
    b0.setBounds(180, 310, 50, 40);
    beq.setBounds(270, 310, 50, 40);
    badd.setBounds(360, 310, 50, 40);
    clear.setBounds(200, 400, 90, 40);
    dot.setBounds(250, 470, 50, 40);

    jrm.add(b7);
    jrm.add(b8);
    jrm.add(b9);
    jrm.add(bdiv);
    jrm.add(b4);
    jrm.add(b5);
    jrm.add(b6);
    jrm.add(bmul);
    jrm.add(b1);
    jrm.add(b2);
    jrm.add(b3);
    jrm.add(bsub);
    jrm.add(bdec);
    jrm.add(b0);
    jrm.add(beq);
    jrm.add(badd);
    jrm.add(clear);
    jrm.add(dot);

    jrm.setLayout(null);
    jrm.setResizable(false);
    jrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jrm.setVisible(true);

    b1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (jtf.getText().equals("Enter two operands!") || jtf.getText().equals("Not defined!"))
          jtf.setText("");
        jtf.setText(jtf.getText() + "1");
      }
    });
    b2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (jtf.getText().equals("Enter two operands!") || jtf.getText().equals("Not defined!"))
          jtf.setText("");
        jtf.setText(jtf.getText() + "2");
      }
    });
    b3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (jtf.getText().equals("Enter two operands!") || jtf.getText().equals("Not defined!"))
          jtf.setText("");
        jtf.setText(jtf.getText() + "3");
      }
    });
    b4.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (jtf.getText().equals("Enter two operands!") || jtf.getText().equals("Not defined!"))
          jtf.setText("");
        jtf.setText(jtf.getText() + "4");
      }
    });
    b5.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (jtf.getText().equals("Enter two operands!") || jtf.getText().equals("Not defined!"))
          jtf.setText("");
        jtf.setText(jtf.getText() + "5");
      }
    });
    b6.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (jtf.getText().equals("Enter two operands!") || jtf.getText().equals("Not defined!"))
          jtf.setText("");
        jtf.setText(jtf.getText() + "6");
      }
    });
    b7.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (jtf.getText().equals("Enter two operands!") || jtf.getText().equals("Not defined!"))
          jtf.setText("");
        jtf.setText(jtf.getText() + "7");
      }
    });
    b8.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (jtf.getText().equals("Enter two operands!") || jtf.getText().equals("Not defined!"))
          jtf.setText("");
        jtf.setText(jtf.getText() + "8");
      }
    });
    b9.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (jtf.getText().equals("Enter two operands!") || jtf.getText().equals("Not defined!"))
          jtf.setText("");
        jtf.setText(jtf.getText() + "9");
      }
    });
    b0.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (jtf.getText().equals("Enter two operands!") || jtf.getText().equals("Not defined!"))
          jtf.setText("");
        jtf.setText(jtf.getText() + "0");
      }
    });
    clear.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (jtf.getText().equals("Enter two operands!") || jtf.getText().equals("Not defined!"))
          jtf.setText("");
        jtf.setText("");
      }
    });
    dot.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (jtf.getText().equals("Enter two operands!") || jtf.getText().equals("Not defined!"))
          jtf.setText("");
        jtf.setText(jtf.getText() + ".");
      }
    });
    badd.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (jtf.getText().equals("Enter two operands!") || jtf.getText().equals("Not defined!"))
          jtf.setText("");
        jtf.setText(jtf.getText() + "+");
      }
    });
    bsub.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (jtf.getText().equals("Enter two operands!") || jtf.getText().equals("Not defined!"))
          jtf.setText("");
        jtf.setText(jtf.getText() + "-");
      }
    });
    bmul.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (jtf.getText().equals("Enter two operands!") || jtf.getText().equals("Not defined!"))
          jtf.setText("");
        jtf.setText(jtf.getText() + "X");
      }
    });
    bdiv.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (jtf.getText().equals("Enter two operands!") || jtf.getText().equals("Not defined!"))
          jtf.setText("");
        jtf.setText(jtf.getText() + "/");
      }
    });

    beq.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        try {
          String S = jtf.getText();
          int i = 0;
          char b = S.charAt(i);
          while (b != '+' && b != '-' && b != 'X' && b != '/' && b != '%') {
            i++;
            b = S.charAt(i);
          }
          Float x, y, ans = 0f;
          x = Float.parseFloat(S.substring(0, i));
          y = Float.parseFloat(S.substring(i + 1, S.length()));
          if (b == '+') {
            ans = x + y;
          } else if (b == '-') {
            ans = x - y;
          } else if (b == 'X') {
            ans = x * y;
          } else if (b == '/') {
            ans = x / y;
          }
          if (b == '/' && y == 0) {
            jtf.setText("Not defined!");
          } else {
            jtf.setText(ans + "");
          }
        } catch (Exception ex) {
          jtf.setText("Enter two operands!");
        }
      }
    });
  }

  public static void main(String[] args) {
    new calculator();
  }

}
