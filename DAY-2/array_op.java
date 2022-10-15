import java.util.*;
public class array_op
{
	public static void main(String[] args)
	{
		try
		{
			int i,j,ch,n,sum;
			Scanner sc=new Scanner(System.in);
			System.out.println("1.Pairs whose sum is equals to given number");
			System.out.println("2.Nth smallest and largest number");
			System.out.println("3.Number of odd and even");
			System.out.print("Enter choice: ");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					System.out.print("Enter no. of integers: ");
					n=sc.nextInt();
					int a[]=new int[n];
					System.out.print("Enter number for sum: ");
					sum=sc.nextInt();
					System.out.println("Enter integers: ");
					for(i=0;i<n;i++)
					{
						a[i]=sc.nextInt();
					}
					int count=0;
					System.out.println("Pairs are : ");					
					for(i=0;i<n;i++)
					{
						for(j=i+1;j<n;j++)
						{
							if ((a[i]+a[j])==sum)
							{
                    					count++;
								System.out.print("("+a[i]+","+a[j]+")"+" ");
							}
						}
					}
					System.out.println("\nCount of pairs is "+count);
					break;
				case 2:
					int x,m,desc,asce,max,min;
					System.out.print("Enter no. of elements: ");
					x=sc.nextInt();
					int a1[]=new int[x];
					System.out.println("Enter elements: ");
					for(i=0;i<x;i++)
					{
		    				a1[i]=sc.nextInt();
					}
					System.out.print("M: ");
					m=sc.nextInt();
					System.out.print("N: ");
					n=sc.nextInt();
					if(m==0 || n==0)
					{
		    				System.out.println("Invalid M,N");
		    				return;
					}
					for(i=0;i<x;i++)
					{
		    				for(j=i+1;j<x;++j)
		    				{
		        				if(a1[i]<a1[j])
		        				{
		            				desc=a1[i];
		            				a1[i]=a1[j];
		            				a1[j]=desc;
		        				}
		    				}
					}
					max=a1[m-1];
					System.out.println(m+" Maximum no. is: "+max);
					for(i=0;i<x;i++)
					{
		    				for(j=i+1;j<x;++j)
		    				{
		        				if(a1[i]>a1[j])
		        				{
		            				asce=a1[i];
		            				a1[i]=a1[j];
		            				a1[j]=asce;
		        				}
		    				}
					}
					min=a1[n-1];
					System.out.println(n+" Minimum no. is: "+min);
					break;
				case 3:
					System.out.print("Enter no. of integers: ");
					n=sc.nextInt();
					int a2[]=new int[n];
					System.out.println("Enter integers: ");
					for(i=0;i<n;i++)
					{
						a2[i]=sc.nextInt();
					}
					int c1=0,c2=0;
					for(i=0;i<n;i++)
					{
						if(a2[i]%2==0)
						{
		    					c1++;
						}
						else
						{
		    					c2++;;
						}
					}
					System.out.println("No. of Even= "+c1);
					System.out.println("No. of Even= "+c2);
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
