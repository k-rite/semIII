class Demofinally {
    public static int procA()
    {

        try {
            int a[] = new int[10];
            a[11] = 23;
            System.out.println("In tru");
            return 0;

        } catch (NullPointerException e) {
            System.out.println("INside Catch");
            return 1;

        } finally {
            System.out.println("INside finally");
            return 2;
        }
    }

    public static void main(String[] args) {
        int r = procA();
        System.out.println(r);
    }
}