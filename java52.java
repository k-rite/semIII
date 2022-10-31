// import java.awt.event.ActionListener;

// import javax.swing.*;

// class java52 extends JFrame implements ActionListener{
//     JCheckBox ch1,ch2;
//     JButton b;
//     JLabel l;
//     JPanel jp;
//     public java52(String S)
//     {
//         super(S);
//         jp = new JPanel();
//         ch1 = new JCheckBox("x");
//         ch2 = new JCheckBox("y");
//         b = new JButton("Test");
//         l = new JLabel();   
//         b.addActionListener(this);
//         jp.add(l);
//         jp.add(ch1);
//         jp.add(ch2);
//         jp.add(b);
//         add(jp);
//     }
// public static void main(String[] args)
//     {
//         JFrame jf= new java52("Check Demo");
//         jf.setSize(250, 250);
//         jf.setVisible(true);
        
//     }
// @Override
// public void actionPerformed(java.awt.event.ActionEvent e) {
//     // TODO Auto-generated method stub
//     String str="";
//         if(ch1.isSelected()) {
//             str=str+ch1.getText();
//         }
//         if(ch2.isSelected()) {
//             str=str+ch2.getText();
//         }
//     l.setText(str);
// }
// }
` class FindingVowels {
    public static void main(String args[]) {
 
       String str = new String("Hi Welcome to Tutorialspoint");
       for(int i=0; i<str.length(); i++) {
          if(str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
             System.out.println("Given string contains "+str.charAt(i)+" at the index "+i);
          }
       }
    }
 }
 