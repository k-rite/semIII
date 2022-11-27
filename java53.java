// Write a program to input name and balance of customer and display an user defined exception 
// if balance less than 1500.
// import java.util.*;
// class java53 {
//     balancelessthan1500(int a)
//     {
//         a=a<1500;
//     }
//     public static void main(String[] args) {
        
    
//   int balance,checker;
//   String name;
//   Scanner sc = new Scanner(System.in);
//   name= sc.nextLine();
// balance = sc.nextInt();

// try {{
// System.out.println("Balance is ok");}}
// catch (Exception e) {
//     System.out.println("Balance is below 1500 and the error is"+e);

// }}}
// A Class that represents use-defined exception
// class Main {
//     // Driver Program
//     public static void main(String args[])
//     {
//         int balance = 4;
//         try {
//             // Throw an object of user defined exception
//             if (balance > 1500){
//             throw new MyException("GeeksGeeks");
//         }}
//         catch (MyException ex) {
//             System.out.println("Caught"+ex);
 
//             // Print the message from MyException object
//             System.out.println(ex.getMessage());
//         }
//     }

// class MyException extends Exception {
// 	public MyException(String s)
// 	{
// 		// Call constructor of parent Exception
// 		super(s);
// 	}
// }}
// A Class that uses above MyException

// Write a program to create interface named test. 
// In this interface the member function is square.
//  Implement this interface in arithmetic class.
// interface test{
//     public void squre(); }
// class algorithm implements test{
//     public void squre(){
//         System.out.println("Square is implemented");}
// public static void main(String[] args) {
//     algorithm ob = new algorithm();
//     ob.squre();}}
    

// import java.util.Arrays;
// import java.util.Scanner;
// class test {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String array[][]= new String[1][3];
// for (int a=0; a<1;a++) {
//     System.out.println("Enter the project number, name, budget");
// for (int i = 0; i < 3;i++) {
//     String input = sc.nextLine();
//     array[a][i] = input;
//     // 
//     }
// }
// for(int i = 0; i < array.length; i++){
//     for (int j = 0; j < array[i].length; j++){
//         System.out.print("["+(array[i][j])+"]");
//     }}

// }}


// import java.util.*;
// class distance {
//     public void covertTocm(int a,int b){
// System.out.println("working");
//     }
//     public void converttofeet(int c){
// System.out.println(0.0328 * c);

//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter 1 to conver feet inch to cm, 2 to convert cm to feet and inches");
//         int response =  sc.nextInt();
//         if (response == 1) {
//             System.out.print("ENter feet");
//             int feet = sc.nextInt();
//             System.out.println("Enter inches");
//             int inches = sc.nextInt();
//             distance ob = new distance();
//             ob.covertTocm(feet, inches);
//     }
//     else if (response == 2) {
//         System.out.print("ENter cm");
//             int cm = sc.nextInt();
//             distance ob1= new distance();
//             ob1.converttofeet(cm);
// }}}


// package question1;
// class addition{
//     public int add(int a, int b){
//         return a + b;
//     }
//     public int multiply(int a, int b){
//         return a*b;
//     }
// }
// class maximum{
//     public int max(int a, int b, int c){
//         if (a>b && a>c){
//             return a;
//         }
//         else if (b>c && b>a){
//             return b;
//     }
//     else {
//         return c;

// }
// }}


// Write a program to input name and balance of customer and 
// display an user defined exception if balance less than 1500.

import java.util.*;

class BalanceException extends Exception{
    public BalanceException(String s){
        super(s);
    }
}
class Exam_prep{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your Balance: ");
        int balance = input.nextInt();
        if (balance<1500){
            try{
            throw new BalanceException("BalanceError: Balance less than 1500");
            }
            catch (BalanceException e){
                System.out.println(e.getMessage());
            }}}}