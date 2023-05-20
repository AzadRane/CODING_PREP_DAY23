//In normal case Exception are handled at Caller of  method


class A 
{
    void display() throws ArithmeticException
    {
        double ans = 10/0;
    }
}


public class ExceptionHandlingDemo2 {
    public static void main(String args[])
    {
        A ib = new A();
        ib.display();
    }
}
