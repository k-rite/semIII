import java.util.*;//to take inputs from the user
class sumofalldigits   
{  
public static void main(String[] args)   
{  
    System.out.println("Enter the number which you want to sum it's digits");
    Scanner sc = new Scanner(System.in); // taking desire number who's sum will be displayed

int number, sum = 0;  
number = sc.nextInt();
while (number != 0)   //For every iteration, we're diving number by 10 so when it's in decimal, the loop will break
{  
    int digits = number % 10;  //diving by 10 to slice single digits then sum it
    sum = sum + digits;  
    number = number/10;  
    }  
    System.out.println("The sum of the given number is: " + sum);  
}  
}  
// Coded by Kritesh Ojha