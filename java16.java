class Static_E {
    int a, b;
    static int c = 10;
    public void printab() {
        System.out.println(a + "\t" + b + "\t" + c);
    }
    public static void incc() { 
        c++;

        // System.out.println(a+"\t"+b+"\t"+c);
    }
}
class Staticdemo {
    public static void main(String[] args) {
        Static_E.incc();
        Static_E ob = new Static_E();
        ob.a = 10;
        ob.b = 20;
        ob.incc();
        ob.printab();
        Static_E ob1 = new Static_E();
        ob1.a = 100;
        ob1.b = 200;
        ob1.incc();
        ob1.printab();
    }
}