class Shape_D {
    public void area() {
        System.out.println("There were no area for Shape");
    }
}
class Circle_D extends Shape_D {
    double r;
    public Circle_D(int r) {
        this.r = r;
    }

    public void area() {
        double a = 3.14 * r * r;
        System.out.println("The area=" + a);
    }
}
class OverideDemo {
    public static void main(String[] args) {
        Shape_D s1 = new Shape_D();
        s1.area();
        Circle_D c1 = new Circle_D(40);
        c1.area();
    }
}

// write a java program to write a class student which has prn name email and a method = printinfo,
// other exam extend student with marks array % grade calculate result print info