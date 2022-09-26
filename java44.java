import java.io.File;
import java.io.FileInputStream;

class java44 {
public static void main(String[] args) {
    File f;
    FileInputStream fi;
    byte b[];
    try{
        f=new File("demo.txt");
        fi=new FileInputStream(f);
        int s=(int)f.length();
        b=new byte[s];
        fi.read(b);
        String str= new String(b); 
        System.out.println(str);
        
    }
    catch(Exception e) {System.out.println(e);}
}    
}
