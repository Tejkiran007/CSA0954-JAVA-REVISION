import java.io.*;
import java.lang.*;
import java.util.*;
 
class one 
{
    public void print_name()
    {
		Scanner sc=new Scanner(System.in);
        	System.out.print("Enter name: ");
		String a=sc.nextLine();
    }
}
 
class two extends one 
{
    public void print_roll() 
    {
    		Scanner sc=new Scanner(System.in);
        	System.out.print("Enter roll no.: ");
		int n=sc.nextInt(); 
    }
}
 
class three extends two 
{
    public void print_mark()
    {
        Scanner sc=new Scanner(System.in);
		double to,p,c,m;
		System.out.print("Enter the python marks: ");
		if(!sc.hasNextInt())
        	{
            	System.out.println("Invalid");
           		return;
        	}
		p=sc.nextDouble();
		System.out.print("Enter the c programming marks: ");
		if(!sc.hasNextInt())
        	{
            	System.out.println("Invalid");
           		return;
        	}
		c=sc.nextDouble();
		System.out.print("Enter the Maths marks: ");
		if(!sc.hasNextInt())
        	{
            	System.out.println("Invalid");
           		return;
        	}
		m=sc.nextDouble();
		to=p+c+m;
		System.out.print("Total marks= "+to);
    }
}
 
// Drived class
public class totalmark 
{
    public static void main(String[] args)
    {
        three g = new three();
        g.print_name();
        g.print_roll();
        g.print_mark();
    }
}
