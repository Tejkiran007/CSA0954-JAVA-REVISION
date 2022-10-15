import java.io.*;
import java.lang.*;
import java.util.*;
 
class details
{
	public int a,b;
	Scanner sc=new Scanner(System.in);
    	public void details()
    	{
		try
		{
       		System.out.print("Number 1: ");
			a=sc.nextInt();
			System.out.print("Number 2: ");
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
 
class display extends details
{
    	public void display() 
	{ 
		System.out.println("Number 1= "+a);
		System.out.println("Number 2= "+b);
	}
}
// Driver class
public class single_inher
{
    	public static void main(String[] args)
    	{
        	display g = new display();
        	g.details();
        	g.display();
    	}
}
