interface Myinterface
{
    public void myinfmethod(int x);
    public void mmydemo();
}
class interfaceDemo implements Myinterface{
    public void myinfmethod(int x)
    {System.out.println("Got value="+x);}
    public void mmydemo()
    {System.out.println("this is interface demo");}
    public static void main(String[] args)
    {
        interfaceDemo id = new interfaceDemo();
        id.myinfmethod(35);
        id.mmydemo();}}