// Write a java to accept element for 2 matrix of size 3 by 3 and print addition of 2 matrix
// Write a java to accept element for 2 matrix of size 3 by 3 and print * of 2 matrix
public class java7 {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int b[][]={{2,3,3},{6,7,2},{1,3,4}};
        int i;
        for (i=0;i<=3;i++){
            System.out.println("Addition:");
            int sum[][] = a[i][i] + b[i][i];
            System.out.println(sum);


        }

    }
}
