class InvalidLogin extends Exception
{
    InvalidLogin(String s)
    {
        super(s);
    }

}
public class UserdefinedExceptionE3 {
    public static void main(String args[])
    {
        try 
        {
            System.out.println("ENter the login name");
            String name = args[0];

            System.out.println("Enter the loggin password");
            String pass = args[1];

            if(name.equals(pass))
            {
                throw new InvalidLogin("Both are Smae");
            }
            else 
            {
                throw new InvalidLogin("Ivalid login detalils");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();

        }
    }    
}
