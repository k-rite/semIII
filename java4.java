import java.util.*;
class JAVA4 {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        x = sc.nextInt();
        sc.close();
        int a = 0;
        int fac = 1;
        for (a = 1; a <= x; a++)
            fac = fac * a;
        System.out.println("factorial:" + fac);
    }
}

// to print sum of all even number and sum of all odd numbers 1 to 1000
// write a java profram to accept int from user and print it's factorial
// write a java user to accept 10 from user find min max from those 10.
// write a java prog to accept int from user and check the number is prime or
// not