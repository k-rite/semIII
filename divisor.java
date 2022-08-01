import java.util.*;//to take input from the user
class JAVA7 {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        x = sc.nextInt();//taking input from the user
        sc.close();
        int a = 0;
        for (a = 1; a <= x; a++) //running a loop from 1 to number which is taken from the user
        if (x%a==0){// checking weather var is dividing the number or not by checking the remainder by %
            System.out.println("Divisor"+a);
        }  
    }
}
//Coded by Kritesh Ojha