import java.util.*;
public class fiz
{
	public static void main(String[] args)
	{
		try
		{
			int n,i;
			String s;
			List<String>col=new ArrayList<>();
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter number: ");
			n=sc.nextInt();
			for(i=1;i<=n;i++)
			{
				if(i%3==0 && i%5==0)
				{
					col.addAll(Arrays.asList("FizzBuzz"));
				}
				else if(i%3==0)
				{
					col.addAll(Arrays.asList("Fizz"));
				}
				else if(i%5==0)
				{
					col.addAll(Arrays.asList("Buzz"));
				}
				else
				{
					s=Integer.toString(i);
					col.addAll(Arrays.asList(s));
				}
			}
			System.out.println();
			System.out.println(col);
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("Invalid");
		}
	}
}
