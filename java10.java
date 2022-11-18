import java.util.*;
class PassArray {
    public int sumNumbers(int nums[]) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int n[] = new int[args.length];
        for (int i = 0; i < n.length; i++) {
            n[i] = Integer.parseInt(args[i]);

        }
        System.out.println(Arrays.toString(n));
        PassArray ob = new PassArray();
        int s = ob.sumNumbers(n);
        System.out.println("Sum of number" + s);
    }
}