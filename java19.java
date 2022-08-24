import java.util.*;
class MyDate {
    public static void main(String[] args) {
        
    
int day,date,month,year;
String SimpleDateFormat;
// SimpleDateFormat format2 = new SimpleDateFormat("dd-MMM-yy");
String[] montharray=new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }; 
Scanner sc = new Scanner(System.in);
System.out.println("Enter the day:");
day = sc.nextInt();
System.out.println("Enter the date:");
date = sc.nextInt();
System.out.println("Enter the month(numeric form only):");
month = sc.nextInt();
System.out.println("Enter the year:");
year = sc.nextInt();
SimpleDateFormat format2 = new SimpleDateFormat("dd-MMM-yy");
System.out.println(SampleDateFormat);
}