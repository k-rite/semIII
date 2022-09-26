import java.io.FileOutputStream;

class Myfilewrite {
    public static void main(String[] args) {
        FileOutputStream fo;
        try {
            fo = new FileOutputStream("demo.txt");
            String s = "sadfghjkl";
            byte b[] = s.getBytes();
            fo.write(b);
            System.out.println("Data written");
            fo.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}