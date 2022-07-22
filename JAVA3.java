public class JAVA3 {
    public static void main(String[] args) {
        int i =0;
        int sumodd=0;
        int sumeven=0;
        for (i=0;i<=1000;i++)
        if (i % 2 != 0) {
            sumodd =sumodd+i; 
        }
        else{
            sumeven=sumeven+i;

        }

        System.out.println("Sum of odd:"+sumodd);
        System.out.println("Sum of even:"+sumeven);}        
       
    }

// to print sum of all even number and sum of all odd numbers 1 to 1000
 // write a java profram to accept int from user and print it's factorial
 // write a java user to accept 10 from user find min max from those 10.
 