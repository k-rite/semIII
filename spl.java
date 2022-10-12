import java.sql.*;

 class DataIns_E
{
  public static void main(String args[])
   {
     int eid=100; String n="PQR"; int sal=34779;
     try{
     Class.forName("com.mysql.jdbc.Driver");
     Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mydata","root","");
     Statement smt=con.createStatement();
     String q="Insert into emp values("+eid+",'"+n+"',"+sal+")";
     smt.execute(q);
     System.out.println("Data Inserted");
     }
     catch(Exception e)
     {System.out.println(e);}
     }
}