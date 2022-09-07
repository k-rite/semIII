import java.util.Scanner;
import java.util.Arrays;

public class Part1 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Size of stack: ");
        int len = scan.nextInt();
        scan.nextLine();
        int[] definedArray = new int[len];
        System.out.println("\nStack is created.\n");
        System.out.println("Stack is empty, Please ensure that there's atlast one item in stack");
        System.out.print("Enter the number you want to insert in stack: ");
        int userInp = scan.nextInt();
        scan.nextLine();
        int inserts = 0;
        push(definedArray, userInp, inserts);
        inserts++;
        String choice = "yes";
        while (choice.equals("yes")) {
            System.out.print("\n Add another number in Stack[yes or no]:\n");
            choice = scan.nextLine();
            if (!(choice.equals("yes"))) {
                System.out.println("\nDoing the insertion....\n");
                break;
            } else if (len == 1) {
                System.out.println("\n Maximum size of the stack is reached.\n   Exiting Insertion...\n");
                break;
            }
            System.out.print("Enter the number here: ");
            userInp = scan.nextInt();
            scan.nextLine();
            push(definedArray, userInp, inserts);
            inserts++;
            if (inserts >= definedArray.length) {
                System.out.println("\nCan't insert more elements. Size limit reached. \nExiting Push Operation...\n");
                break;
            }
        }
        System.out.println(Arrays.toString(definedArray));
        System.out.print("\nDo you want to delete elements from the Stack (yes/no): ");
        String choice2 = scan.nextLine();
        int elements = inserts;
        int[] finalArray = new int[len];
        if (choice2.equals("yes") || choice2.equals("y")) {
            while (choice2.equals("yes") || choice2.equals("y")) {
                finalArray = pop(definedArray, len);
                System.out.println("\nSuccessful\n");
                elements--;
                if (elements == 0) {
                    System.out.println("No element left to Delete.\n");
                }
                System.out.print("Do you want to delete another element: ");
                choice2 = scan.nextLine();
            }
        } else {
            System.out.println("\n The Program is shuting down now....");
            System.exit(0);
        }
        System.out.println("Stack: " + Arrays.toString(finalArray));

    }

    public static void push(int[] stack, int userInp, int theInserts) {
        if (theInserts < stack.length) {
            stack[theInserts] = userInp;
            System.out.println("\nInserted.");
        }
    }

    public static int[] pop(int[] stack, int size) {
        int[] newArray = new int[stack.length];
        for (int i = 0; i < (size - 1); i++) {
            newArray[i] = stack[i];
        }
        return newArray;
    }
}