//In case of main method exceptions are thrown at JVM

public class ExceptionHandlingDemo1
{
    public static void main(String args[]) throws ArithmeticException
    {
        double a = 10/0;

        System.out.println(a);
    }
}