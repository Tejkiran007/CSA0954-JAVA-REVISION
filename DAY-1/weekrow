import java.util.*;
public class weekrow
{
	public static void main(String[] args)
	{
		int i,j,n=5,c;
		int a[][]=new int[n][n];
		int x[]=new int[n];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the matrix: ");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		for(i=0;i<n;i++)
		{
			c=0;
			for(j=0;j<n;j++)
			{
				if(a[i][j]==1)
				{
					c++;
				}	
			}
			System.out.println(i+" Row: "+c);
			x[i]=c;
		}
		for(i=0;i<n;i++)
		{
			System.out.print(" "+x[i]);
		}
		int index = 0;
    		int min = x[index];
    		for (i = 1; i <n; i++)
		{
        		if (x[i] <= min)
			{
       			min = x[i];
        			index = i;
        		}
    		}
		System.out.print("\nWeakest row = "+index);
	}
}
