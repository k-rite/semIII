// // use void to return empty value, if method returning something use return
// class Method_Demo {
//     public static void main(String[] args) {
//         int a = 20;
//         int b = 10;
//         Method_Demo ob = new Method_Demo();
//         ob.add(a, b);
//     }
//     public void add(int a, int b) {
//         int c = a + b;
//         System.out.println("addition=" + c);
//     }
        
// }

// use void to return empty value, if method returning something use return
class Method_Demo {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        Method_Demo ob = new Method_Demo();
        int c=ob.add(a, b);
        ob.add(a, b);
        System.out.println("addition"+c);
    }
    public int add(int a, int b) {
        int c = a + b;
    return c;    }
}