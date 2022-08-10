class Box_E {
    int l, h, b, v;

    public Box_E() {
        l = 1;
        b = 1;
        h = 1;
    }

    public Box_E(int a, int c, int d) {
        l = a;
        b = c;
        h = d;
    }

    public int volume() {
        return l * b * h;
    }
}

class Box_Demo {
    public static void main(String[] args) {
        Box_E ob = new Box_E();
        Box_E ob1 = new Box_E(10, 20, 30);
        System.out.println("Volume of BOX:" + ob.volume());
        System.out.println("Volume of BOX 2:" + ob1.volume());
    }
}