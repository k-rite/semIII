import java.io.*;

class FileWrite {
    public static void main(String[] args) {
        
        try {
            FileWriter fw = new FileWriter("Mytext.txt");
            String s = "This is data to be written to the file.";
            char ch[] = new char[s.length()];
            s.getChars(0, s.length(), ch, 0);
            fw.write(ch);
            fw.close();
            System.out.println("Data written to file");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}