import java.util.*;
class ArrayOperations
{
    int a,b,c;
    public void add()
    {
        c=a+b;
    }
    public void printdata()
    {
        System.out.println("Addition is"+c);
    }
    public void getdata()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        a=sc.nextInt();
        System.out.println("Enter a number:");
        b=sc.nextInt();
        sc.close();
    }
}
    
class Arthmaticdemo
{
    public static void main(String[] args) {
        Arthmatic ob = new Arthmatic();
        ob.getdata();
        ob.add();
        ob.printdata();
    }
}