import java.io.*;
class java49 {
public static void main(String[] args) {
    String firstfile = args[0];
    String secondfile = args[1];
    FileInputStream fi;
    FileOutputStream fo; 
    try {
        byte c[];
        File f;
        f = new File(firstfile);
        fi = new FileInputStream(f);
        int s = (int) f.length();
        c = new byte[s];
        fi.read(c);
        String str = new String(c);
        System.out.println(str);
        fo = new FileOutputStream(secondfile);
        byte b[] = str.getBytes();
        fo.write(b);
        System.out.println("Data written");
        fo.close();
    } catch (Exception a) {
        System.out.println("Make sure you are entering correct filenames, Error ur getting is"+a);
    }
}    
}
