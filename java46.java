import java.util.Arrays;
import java.util.Scanner;

class java46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array size");
        int size = sc.nextInt();
        sc.nextLine();
        String[] strAr1 = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the element which you want to add in array at element" + i);
            String elements = sc.nextLine();
            strAr1[i] = elements;
        }
        sc.close();
        for (int a = 0; a < size; a++) {
            String h = "Hello";
            if (h.equals(strAr1[a])) {
                strAr1[a] = "Null";
            }
        }
        System.out.println(Arrays.toString(strAr1));
    }
}