class NoMatchException extends Exception 
{
    NoMatchException(String s)
    {
        super(s);
    }
}

public class UserdefinedExceptionE2 {
    public static void main(String args[])
    {
        try{
        
            String s = args[0];

            if(!s.equals("INDIA"))
            {
                throw new NoMatchException("Given string is not INDIA");
            }
            else{
                throw new NoMatchException("VALID STRING INDIA");
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
