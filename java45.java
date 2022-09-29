import java.util.*;

class ageexception extends Exception
{
    public String toString()
    {
        return "this is exceptopm";}
    }
        class MyExpDemo
        {
            public static void main(String[] args) {
                {
                    int ag;
                    Scanner sc=new Scanner(System.in);
                    System.out.println("Enter Age");
                    ag = sc.nextInt();
                    try{
                    if(ag<18)
                    throw new ageexception();
                }
                catch(Exception e) {System.out.println(e);
            }
        }
    }}
