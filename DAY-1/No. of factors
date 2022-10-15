import java.util.*;
public class factors
{
	public static void main(String[] args)
	{
		int x,i,c=0,n;
		List<Integer> posi = new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.print("Given number: ");
		n=sc.nextInt();
		System.out.print("N: ");
		x=sc.nextInt();
		if(n<0)
		{
			n=-1*n;
			for(i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					c++;		
					posi.addAll(Arrays.asList(i*-1));
				}	
			}
		}
		else
		{
			for(i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					c++;		
					posi.addAll(Arrays.asList(i));
				}	
			}
		}
		System.out.println("Number of factors= "+c);
		System.out.println("Factors = "+posi);
		if(x==0)
		{
			System.out.println("Invalid N");
			return;
		}
		if(x>c)
		{
			System.out.println("Invalid N it only consists of "+c+" factors");
			return;
		}
		System.out.println(x+" factor of "+n+" = "+posi.get(x-1));
	}
}
