class MethodOverload {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a) {
        return a + 10;
    }

    public String add(String a, String b) {
        return a + b;
    }
}

class MethodOverloaddemo {
    public static void main(String[] args) {
        int r;
        String s;
        MethodOverload ob = new MethodOverload();
        r = ob.add(20);
        System.out.println(r);
        r = ob.add(25, 45);
        System.out.println(r);
        s = ob.add("Hi", "Hello");
        System.out.println(s);
    }
}