import java.io.*;
import java.lang.*;
import java.util.*;
 
class detail
{
	public double t,b,bou,s;
	public String g;
	public char c;
    	public void getdetails()
    	{
        	try
		{
			Scanner sc =new Scanner(System.in);
			System.out.print("Enter grade of employee: ");
			g=sc.nextLine();
			c=g.charAt(0);
			System.out.print("Enter the employee salary: ");
			s=sc.nextDouble();
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.exit(0);
		}
    	}
}
 
class valid extends detail 
{
    	public void vali() 
	{
		try
		{
			if(s<0)
			{
		    		System.out.println("Invalid Salary can not be negative");
		    		System.exit(0);
			}
			if(c=='A' || c=='B')
			{
		    		System.out.println();
			}
			else
			{
		    		System.out.println("Invalid Grade");
		    		System.exit(0);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.exit(0);
		}
		
	}
}
 
class cal extends valid
{
    	public void calcu()
    	{
        	if(g.equals("A"))
		{
		    	b=0.05*s;
		    	if(s<10000)
    			{
    		    		bou=b+(0.02*s);
    		    		t=s+bou;
			}
			else
    			{
    		    		t=s+b;
			}
		}
		else if(g.equals("B"))
		{
		    	b=0.1*s;
		    	if(s<10000)
    			{
    		    		bou=b+(0.02*s);
    		    		t=s+bou;
			}
			else
    			{
    		    		t=s+b;
			}
		}
    	}
}
class display extends cal
{
	public void dis()
    	{
		System.out.println("Salary: "+s);
    		System.out.println("Bonus: "+b);
    		System.out.println("Total be paid: "+t);
	}
}
// Drived class
public class bonus
{
    	public static void main(String[] args)
    	{	
        	display g = new display();
        	g.getdetails();
        	g.vali();
        	g.calcu();
		g.dis();
    }
}
