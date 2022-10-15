import java.io.*;
import java.lang.*;
import java.util.*;
class details
{
	public int a,b,i,cal;
	Scanner sc=new Scanner(System.in);
    	public void detail()
    	{
        	try
		{
			System.out.println("Enter the a and b: ");
			a=sc.nextInt();
			b=sc.nextInt();
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
    	public void calcu() 
	{ 
		for(i=1;i<=10;i++)
		{
	        	cal=a*i;
		      System.out.println(a +"*" +i+"=" +cal);
		}
		System.out.println();	
	}
}
 
class display extends calc 
{
    	public void dis()
    	{
      	for(i=1;i<=10;i++)
	    	{
			cal=b*i;
		      System.out.println(b +"*" +i+"="+cal );
		}
    	}
}
 
// Drived class
public class table 
{
    	public static void main(String[] args)
    	{
        	display g = new display();
        	g.detail();
        	g.calcu();
        	g.dis();
    	}
}
