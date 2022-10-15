import java.util.*;
public class patterns
{
	public static void main(String[] args)
	{
		try
		{
			int i,j,n,c=0,k,num,ch;
			Scanner sc=new Scanner(System.in);
			System.out.println("1.Right triangle numbers \n2.Right triangle numbers Square \n3.verticle pyramid of 1's\n4.Pascal triangle");
			System.out.print("Enter choice: ");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					System.out.print("Enter no. of rows: ");
					n=sc.nextInt();
					for(i=1;i<=n;i++)
					{
						for(j=1;j<=i;j++)
						{
							System.out.print(i+" ");
						}
						System.out.println();
					}
					break;
				case 2:
					System.out.print("Enter no. of rows: ");
					n=sc.nextInt();
					for(i=1;i<=n;i++)
					{	
						for(j=1;j<=i;j++)
						{	
							c++;
							System.out.print(c*c+" ");
						}
						System.out.println();
					}
					break;
				case 3:
					System.out.print("Enter no. of rows: ");
					n=sc.nextInt();
					for(i=1;i<=n;i++)
					{
						for(j=1;j<=i;j++)
						{
							System.out.print(1+" ");
						}
						System.out.println();
					}
					for(i=n-1;i>=1;i--)
					{
						for(j=i;j>=1;j--)
						{
							System.out.print(1+" ");
						}
						System.out.println();
					}
					break;
				case 4:
					System.out.print("Enter no. of rows: ");
					n=sc.nextInt();	
					for(i=0;i<n;i++)
      				{
         					for(k=n;k>i;k--)
         					{
            					System.out.print(" ");
         					}
         					num=1;
         					for(j=0; j<=i; j++)
         					{
            					System.out.print(num+" ");
            					num = num*(i-j)/(j+1);
         					}
         					System.out.println();
      				}
				default:
					break;
			}
		}
		catch(Exception e)
		{
			System.out.print("Invalid Input");
			return;
		}	
	}
}
