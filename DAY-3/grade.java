import java.io.*;
import java.lang.*;
import java.util.*;
 
interface detail 
{
    public void getdetails();
}
 
interface valid 
{
    public void validating();
}
interface calc 
{
    public void calcu();
}
interface display extends detail,valid,calc 
{
    public void dis();
}
class child implements display 
{
	public double to,p,c,m,ph,a;
	Scanner sc=new Scanner(System.in);
    	public void getdetails()
    	{
		try
		{
        		System.out.print("Enter the python marks: ");
			p=sc.nextDouble();
			System.out.print("Enter the c programming marks: ");
			c=sc.nextDouble();
			System.out.print("Enter the Maths marks: ");
			m=sc.nextDouble();
			System.out.print("Enter the Physics marks: ");
			ph=sc.nextDouble();
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("Invalid");	
			System.exit(0);	
		}
    	}
    	public void validating() 
	{ 
		if(p<0 || c<0 || m<0 || ph<0 || p>100 || c>100 || m>100 || ph>100)
		{
			System.out.print("Invalid input");	
			System.exit(0);
		}
		if(p<40 || c<40 || m<40 || ph<40)
		{
			System.out.print("Grade: Fail");	
			System.exit(0);
		}
	}
	public void calcu()
	{
		try
		{
			to=p+c+m+ph;
			a=(to/400)*100;
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("Invalid");	
			System.exit(0);	
		}
	}
	public void dis()
	{
		System.out.println("Total= "+to);
		System.out.println("Aggregate= "+a);
		if(a>=75)
		{
			System.out.println("Distincttion");
		}
		else if(a>=60 && a<75)
		{
			System.out.println("First Division");
		}
		else if(a>=50 && a<60)
		{
			System.out.println("Second Division");
		}
		else if(a>=40 && a<50)
		{
			System.out.println("Third Division");
		}
		else
		{
			System.out.println("Fail");			
		}
	}
}

// Drived class
public class grade
{
    	public static void main(String[] args)
    	{	
        	child c = new child();
        	c.getdetails();
        	c.validating();
        	c.calcu();
		c.dis();
    	}
}
