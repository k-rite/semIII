import java.io.*;

class FileReader {
    public static void main(String[] args) {
        try {
            File f=new File("Mytext.txt");
            FileReader fr = new FileReader(f);
            char ch[] = new char[(int)f.length()];
            fr.read(ch);
            String s=new String(ch);
            System.out.println(s);
            fr.close();
        }
        catch (Exception e) {System.out.println(e);}
    }
    
}
