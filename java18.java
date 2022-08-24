class copydemo
{
    int a,b;
    public copydemo(int a,int b)
    {
        this.a = a;this.b=b;}
    public copydemo(copydemo ob)
    {
        a=ob.a;b=ob.b;
    }
    public static void main(String[] args)
    {
        copydemo ob=new copydemo(20,34);
        copydemo ob1=new copydemo(ob);
        ob1.a=240;ob1.b=590;
        System.out.println("OB1: " + ob.a+"\t"+ob.b);
        System.out.println("OB2: " + ob1.a+"\t"+ob1.b);
        copydemo ob2=ob;
        ob2.a=5790;ob2.b=8907;
        System.out.println("OB2: " + ob.a+"\t"+ob.b); 
    }
}