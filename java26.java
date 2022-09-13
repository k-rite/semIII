import java.util.Arrays;
import java.util.Scanner;

public class java26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array size");
        int size = sc.nextInt();
        int[] Array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the element which you want to add in array at element" + i);
            int elements = sc.nextInt();
            Array[i] = elements;
        }
        while (true) {
            System.out.println("1 for Length | 2 for Reverse | 3 for Search | 4 for Find & Replace | 5 for Exit");
            int response = sc.nextInt();
            switch (response) {
                case 1:
                    System.out.println("Length of the array is:" + Array.length);
                    break;
                case 2:
                    int[] revarray = new int[size];
                    for (int i = 0; i < size; i++) {
                        revarray[i] = Array[Array.length - (i + 1)];
                    }
                    System.out.println("Reverse Array is:");
                    System.out.println(Arrays.toString(revarray));
                    break;
                case 3:
                    System.out.println("Enter the value which you want to Search");
                    int search = sc.nextInt();
                    for (int i = 0; i < size; i++) {
                        if (search == Array[i]) {
                            System.out.println("We found the element at index " + i);
                            System.out.println(Array[i]);
                        } else {
                            System.out.println("Element not found in the array at index" + i);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Enter the value which you want to find");
                    int find = sc.nextInt();
                    System.out.println("Enter the value which you want to replace");
                    int replace = sc.nextInt();
                    for (int i = 0; i < size; i++) {
                        if (find == Array[i]) {
                            System.out.println("We found the element at index " + i);
                            Array[i] = replace;
                            System.out.println(Arrays.toString(Array));
                        } else {
                            System.out.println("Element not found in the array");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Exit ;)");
                    System.exit(0);
            }
        }
    }
}