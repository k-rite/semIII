import java.util.*;
class NameoftheCLASs
{
    public static void main(String[] args)

    {
        int x,y,z;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number");
        x= sc.nextInt();
        System.out.print("Enter number");
        y=sc.nextInt();;
        z=x+y;
        if (x>y)
        {
            System.out.println("X is greater than Y.");
        }
        else
        {
            System.out.println("X is less than Y");
        }
        
        System.out.println("Welcome to Java!"+z);
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