import javax.swing.*;
import java.awt.event.*;

class calculator extends JFrame implements ActionListener {
  JPanel jp;
  JButton clear, addbt,enter,multiply,subtraction,division;
  JLabel Result;
    JTextField textarea;
  public calculator(String s) {
    super(s);
    jp = new JPanel();
    Result = new JLabel("Result is");
    enter = new JButton("Enter");
    addbt = new JButton("Add");
    multiply = new JButton("multiply");
    subtraction= new JButton("subtraction");
    division  = new JButton("division");
    clear = new JButton("Clear");
    textarea = new JTextField(46);
    enter.addActionListener(this);
    addbt.addActionListener(this);
    clear.addActionListener(this);
    division.addActionListener(this);
    subtraction.addActionListener(this);
    multiply.addActionListener(this);
    jp.add(textarea);
    jp.add(enter);
    jp.add(addbt);
    jp.add(subtraction);
    jp.add(multiply);
    jp.add(division);
    jp.add(clear);
    jp.add(Result);
    add(jp);
  }
  /* (non-Javadoc)
 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
 */

public static int b=0;
public void actionPerformed(ActionEvent e) {
    String cmd = e.getActionCommand();
    System.out.println(cmd);
    switch(cmd){
        case "Add":
        int add = Integer.parseInt(textarea.getText());
        b+=add;
        textarea.setText("");
        break;
        case "multiply":
        int multiply = Integer.parseInt(textarea.getText());
        textarea.setText("");
        b*=multiply;
        textarea.setText("");
        break;
        case "subtraction":
        int sub = Integer.parseInt(textarea.getText());
        textarea.setText("");
        b-=sub;
        textarea.setText("");
        break;
        case "division":
        int div = Integer.parseInt(textarea.getText());
        textarea.setText("");
        b/=div;
        textarea.setText("");
        break;
        case "Enter":
        Result.setText("Result is"+b);
        break;
        case "Clear":
        b=0;
        textarea.setText("");
        break;
    }
    Result.setText("Result is"+b);
      System.out.println(cmd);
    }
    public static void main(String args[]) {
    JFrame jf = new calculator("Ultra Pro Max Calculator");
    jf.setSize(600, 600);
    jf.setVisible(true);
  }
}