class PassObDemo{
    int a,b;
    public static void tryOb(PassObDemo ob) 
    {ob.a=200;ob.b=400;}
    public static void main(String[] args)
    {
        PassObDemo ob1=new PassObDemo();
        ob1.a=10;
        ob1.b=20;
        System.out.println(ob1.a+"\t"+ob1.b);
        tryOb(ob1);
        System.out.println(ob1.a+"\t"+ob1.b);
    }
}