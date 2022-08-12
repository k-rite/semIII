import java.util.*;

class ArrayOperations {
  private static final String sc = null;
  int i;

  /**
   * @return
   */
  public int [] input(){
        int[] arr = new int[5];
        for(int i=0;i<5;i++)
        {System.out.println("Enter elements, you want in the array:");
    arr[i]= sc.nextln();}
    }return arr;
}

class UseArrayOps {
  /**
   * @param args
   */
  public static void main(String[] args) {
    System.out.println("Enter which operation you want to do: 1 for Input, 2 for Sortting, 3 for finding maximum, 4 for Search, 5 to Exit");
    Scanner sc = new Scanner(System.in);
    int response = sc.nextInt();
    if (response == 1) {
      ArrayOperations ob = new ArrayOperations();
      System.out.println("Your array is" + ob.input());}
      else {
        System.out.println("Your array is");
      }
    // } else if (response == 2) {
    //   ArrayOperations ob = new sort();
    // } else if (response == 3) {
    //   ArrayOperations ob = new max();
    // } else if (response == 4) {
    //   ArrayOperations ob = new search();
    // } else if (response == 5) {
    //   ArrayOperations ob = new exit();
    // }
  }
  }}