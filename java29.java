class java29 {
    public static void throwE() throws NullPointerException 
    { System.out.println("This is Throw demo"); 
    throw new NullPointerException(); }
    public static void main(String[] args) {
        throwE();
    }
}