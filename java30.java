import javax.swing.*;
class MyFrameDemo extends JFrame {
    public MyFrameDemo (String s) {
        super(s);
    }
    public static void main(String[] args) {
        JFrame jf=new MyFrameDemo("This is Demo");
        jf.setSize(500,500);
        jf.setVisible(true);
    }
}