public class AssertionExample {

    public static void main(String args[])
    {
        int n = Integer.parseInt(args[0]);
        
        assert(n>=0): "Negative no. are not allowed";

        int fact = 1;

        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }

        System.out.println(fact);
    }
}


//use -ea while running the java comand to enable the assert

// use -da to disable the assert the asert command