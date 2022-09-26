import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

class java34 extends JFrame implements ActionListener {
    JPanel jp;
    JButton write, read, clear;
    JLabel Lfile, Ltext;
    JTextField tfile, ttext;

    public java34(String s) {
        super(s);
        jp = new JPanel();
        Lfile = new JLabel("Enter file name");
        tfile = new JTextField(46);
        Ltext = new JLabel("Enter text");
        ttext = new JTextField(46);
        write = new JButton("write");
        read = new JButton("read");
        clear = new JButton("clear");
        write.addActionListener(this);
        read.addActionListener(this);
        clear.addActionListener(this);
        jp.add(Lfile);
        jp.add(tfile);
        jp.add(Ltext);
        jp.add(ttext);
        jp.add(write);
        jp.add(read);
        jp.add(clear);
        add(jp);
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        String filename = tfile.getText();

        String text = ttext.getText();
        System.out.println(cmd);
        switch (cmd) {
            case "write":
                FileOutputStream fo;
                try {
                    fo = new FileOutputStream(filename);
                    byte b[] = text.getBytes();
                    fo.write(b);
                    System.out.println("Data written");
                    fo.close();
                } catch (Exception a) {
                    System.out.println(a);
                }
                break;
            case "read":
                File f;
                FileInputStream fi;
                byte b[];
                try {
                    f = new File(filename);
                    fi = new FileInputStream(f);
                    int s = (int) f.length();
                    b = new byte[s];
                    fi.read(b);
                    String str = new String(b);
                    System.out.println(str);

                } catch (Exception c) {
                    System.out.println(c);
                }
                break;
            case "clear":
                ttext.setText("");
                tfile.setText("");
                break;
        }

    }

    public static void main(String[] args) {
        JFrame jf = new java34("File writer | Class work");
        jf.setSize(600, 600);
        jf.setVisible(true);
    }
}
