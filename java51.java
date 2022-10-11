abstract class shape{
    public abstract void draw();
    public void area()
    {
        System.out.println("No area");
    }}
    class Rect extends shape
    {
        int l=20;
        int b=40;
        public void draw()
        { System.out.println("Drawing rect");}
        public void area()
            {int a=l*b; System.out.println("Area " + a);}
           
           
            public static void main(String[] args) {
                shape rt = new Rect();
                rt.draw();
                rt.area();
            }
    }