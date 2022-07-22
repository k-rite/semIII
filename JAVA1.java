//accept 3 numbers from the user and find mean and max between them and print the minimum and maximum numbers
import java.util.*;
class NameoftheCLASs
{
    public static void main(String[] args)

    {
        int x,y,z;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number x:");
        x= sc.nextInt();
        System.out.print("Enter number y:");
        y=sc.nextInt();
        System.out.print("Enter number z:");
        z=sc.nextInt();

        if (x>y && x>z)
        {
            System.out.println("X is maximum"+x);
        }
        else if (y>x && y>z)
        {
            System.out.println("Y is maximum"+y);
        }
        else 
        {
            System.out.println("Z is maximum"+z);
        }

        if (x<y && x<z)
        {
            System.out.println("X is minimum"+x);
        }
        else if (y<x && y<z)
        {
            System.out.println("Y is minimum"+y);
        }
        else 
        {
            System.out.println("Z is minimum"+z);
        }

        sc.close();
    }
}

/* Identifier : Class/method/var
 * combination of letter num _$
 * cant start with digit
 * ==============================
 * VARIABLE 
 * int/double/char/float must set data type while declaring
 */