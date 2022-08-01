import java.util.*;// to take input from user

class ReverseNumber   
{  
public static void main(String[] args)   
{  
    System.out.println("Enter the number which you want to reverse");
    Scanner sc = new Scanner(System.in);//Taking inputs as sc to reverse it

int number, reverse = 0;  
number = sc.nextInt();
while(number != 0)   //For every iteration, we're diving number by 10 so when it's in decimal, the loop will break
{  
int remainder = number % 10; 
reverse = reverse * 10 + remainder;  
// flow of code:
// 5*10 +6 = 56, reversal for 65
number = number/10;  
}  
System.out.println("The reverse of the given number is: " + reverse);  //printing the reversed number
}  
}  //coded by Kritesh Ojha