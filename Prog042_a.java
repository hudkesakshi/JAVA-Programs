class Prog042_a
{
    static int a=10;
    static void show()
    {
        System.out.println("Value of a is show()="+a);
    }
    public static void main(String args[]) 
    {
        show();
        System.out.println("value of A in main="+a);    
    }
    static
    {
        System.out.println("Value of A in static block="+a);
    }
}