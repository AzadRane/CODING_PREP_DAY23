import java.io.*;

class TemperatureException extends Exception
{
    TemperatureException(String s)
    {
        super(s);
    }
}

public class UserdefinedExceptionE1 {
    public static void main(String args[])throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      
        try{
    
            System.out.println("Enter the tempoeratiure :");
            float temp = Float.parseFloat(br.readLine());
            
            if(temp<94)
            {
                throw new TemperatureException("Temperature is below Normal");
            }
            else if(temp>=95 && temp<=100)
            {
                throw new TemperatureException("Normal Temperature");
            }
            else 
            {
                throw new TemperatureException("Temperature is higher aboeve normal Temp");
            }
        }
        // catch(TemperatureException e)
        // {
        //     System.out.println(e);
        // }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }    
}
