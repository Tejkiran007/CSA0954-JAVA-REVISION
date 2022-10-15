import java.io.*;
import java.lang.*;
import java.util.*;
class details
{
	public double x,y,amount;
	Scanner input = new Scanner(System.in);
    	public void detail()
    	{
		try
		{
        		System.out.println("Enter the amount:");
        		amount = input.nextDouble();
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("Invalid");	
			System.exit(0);
		}
    	}
}
 
class calc extends details 
{
    	public void cal()
	{ 
		if(amount<=0)
	      {
		 	System.out.println("Invalid");
		      System.exit(0);
        	} 
        	if(amount<=150000)
        	{
            	System.out.println("No Tax");
		      System.exit(0);
        	}
		x=amount;
		if(x>150000 && x<=300000)
		{
			y=x*0.1;
		}
		if(x>300000 && x<=500000)
		{
			y=x*0.2;
		}
		if(x>500000)
		{
			y=x*0.3;
		}
          	if(amount==0||amount<0||x<0)
        	{
          		System.out.println("Invalid");    
        	}
	}
}

class display extends calc 
{
    public void dis()
    {
    		System.out.println("Tax: "+y);
    }
}
 
// Drived class	
public class tax 
{
    public static void main(String[] args)
    {
        display g = new display();
        g.detail();
        g.cal();
        g.dis();
    }
}
