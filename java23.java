interface A {
    public void method1();

    public void method2();
}
interface B extends A {
    public void method3();
}
class myinf implements B {
    public void method1() {
        System.out.println("Implemented method1");
    }
    public void method2() {
        System.out.println("Implemented method2");
    }
    public void method3() {
        System.out.println("Implemented method3");
    }
    class myinfdemo {
        public static void main(String[] args) {
            myinf mil = new myinf();
            mil.method1();
            mil.method2();
            mil.method3();
        }
    }
}