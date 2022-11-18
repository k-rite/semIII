// import java.io.*;
// class java49 {
// public static void main(String[] args) {
//     String firstfile = args[0];
//     String secondfile = args[1];
//     FileInputStream fi;
//     FileOutputStream fo; 
//     try {
//         byte c[];
//         File f;
//         f = new File(firstfile);
//         fi = new FileInputStream(f);
//         int s = (int) f.length();
//         c = new byte[s];
//         fi.read(c);
//         String str = new String(c);
//         System.out.println(str);
//         fo = new FileOutputStream(secondfile);
//         byte b[] = str.getBytes();
//         fo.write(b);
//         System.out.println("Data written");
//         fo.close();
//     } catch (Exception a) {
//         System.out.println("Make sure you are entering correct filenames, Error ur getting is"+a);
//     }
// }    
// }
// Write a java program to accept employee details from user and add it to employee table in mysql

import java.sql.*;
import java.util.*;
/**
 * Exam_prep
 */
class Exam_prep {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        String name = input.nextLine();
        System.out.print("Enter Employees DOB: ");
        String dob = input.nextLine();
        System.out.print("Enter Employee's DOJ: ");
        String doj = input.nextLine();
        System.out.print("Enter Employee's salary: ");
        String salary = input.nextLine();

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/employees", "root","");
            Statement smt = con.createStatement();
            String query = "INSERT INTO EMPLOYEE VALUES('"+name+"'','"+dob+"','"+doj+"','"+salary+"');";
            smt.execute(query);
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }}