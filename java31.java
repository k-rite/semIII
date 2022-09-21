import javax.swing.*;
import java.awt.event.*;

class MyTextDemo extends JFrame implements ActionListener {
  JTextField jt, jt1, jt2;
  JLabel jl, jl1, jl2;
  JPanel jp;
  JButton jb, jb1;

  public MyTextDemo(String s) {
    super(s);
    jp = new JPanel();
    jl = new JLabel("Enter Number");
    jl1 = new JLabel("Enter Number");
    jt = new JTextField(10);
    jt1 = new JTextField(10);
    jl2 = new JLabel("Result");
    jt2 = new JTextField(10);
    jb = new JButton("Add");
    jb1 = new JButton("Sub");
    jb.addActionListener(this);
    jb1.addActionListener(this);
    jp.add(jl);
    jp.add(jt);
    jp.add(jl1);
    jp.add(jt1);
    jp.add(jl2);
    jp.add(jt2);
    jp.add(jb);
    jp.add(jb1);
    add(jp);
  }

  public void actionPerformed(ActionEvent ae) {
    int c = 0;
    int a = Integer.parseInt(jt.getText());
    int b = Integer.parseInt(jt1.getText());
    if (ae.getSource() == jb) {
      c = a + b;
    }
    if (ae.getSource() == jb1) {
      c = a - b;
    }
    jt2.setText("" + c);
  }

  public static void main(String args[]) {
    JFrame jf = new MyTextDemo("This is Text Demo");
    jf.setSize(600, 600);
    jf.setVisible(true);
  }
}