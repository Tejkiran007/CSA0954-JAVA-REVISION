import java.util.*;
public class digits
{
	public static void main(String[] args)
	{
		int x,c=0,re;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter an integer: ");
		if(!sc.hasNextInt())
		{
			System.out.print("Number of digits is: Error ");
			return;
		}
		x=sc.nextInt();
		if(x==0)
		{
			System.out.print("Number of digits are 1");
			return;
		}
		while(x!=0)
		{
			re=x%10;
			c++;
			x=x/10;
		}
		System.out.print("Number of digits are "+c);
	}
}
