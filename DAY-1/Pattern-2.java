import java.util.*;
public class pat
{
	public static void main(String[] args)
	{	
		Scanner sc=new Scanner(System.in);
		int n,i,j;
		System.out.print("Enter the rows: ");
		n=sc.nextInt();
		System.out.println();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		for(i=n-1;i>=1;i--)
		{
			for(j=i;j>=1;j--)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
