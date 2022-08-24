import java.util.Scanner;

class MyDate {
    int day, month, year;

    public MyDate(int dd, int mm, int yyyy) {
        day = dd;
        month = mm;
        year = yyyy;
    }

    public MyDate() {
        day = 0;
        month = 0;
        year = 0;
    }

    public void changeDate() {
        // formatting dates
        System.out.println("1. MM/DD/YYYY: " + month + "/" + day + "/" + year);
        String fmnt[] = { "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC" };
        System.out.println("2. DD-MM-YYYY: " + day + "-" + fmnt[month - 1] + "-" + year);
    }
}

class Distance {
    float feet, inch;
    static int countx = 0;

    public Distance(float ft, float inc) {
        feet = ft;
        inch = inc;
        countx++;
    }

    public Distance() {
        feet = 0;
        inch = 0;
        countx++;
    }

    public void convert() {
        System.out.println("Feet to Centimeter: " + feet * 30.48 + "cm");
        System.out.println("Inch to Centimeter: " + inch * 2.54 + "cm");
    }

    public void count() {
        System.out.println("Number of Distance objects created is: " + countx);
    }
}

class Conversions {
    public static void main(String[] args) {
        // Taking inputs
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Day: ");
        int day = sc.nextInt();
        System.out.print("Enter the month: ");
        int month = sc.nextInt();
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        // calling other class/their objects
        MyDate abc = new MyDate();
        MyDate date = new MyDate(day, month, year);
        date.changeDate();
        System.out.print("Enter the distance in Feet: ");
        int feets = sc.nextInt();
        System.out.print("Enter the distance in Inch: ");
        int inch = sc.nextInt();
        // calling other class/their objects
        Distance dx = new Distance();
        Distance dsc = new Distance(feets, inch);
        dsc.convert();
        dsc.count();
        sc.close();
    }

}