import java.util.*;
public class array_operation
{
	public static void main(String[] args)
	{
		try
		{
			int i,j,ch,n,m;
			Scanner sc=new Scanner(System.in);
			System.out.println("1.Separate odd and even numbers");
			System.out.println("2.No. of Composite numbers");
			System.out.println("3.1st element number 2nd element of its square");
			System.out.println("4.Common elements in an array");
			System.out.print("Enter choice: ");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					List<Integer> odd=new ArrayList<>();
					List<Integer> even=new ArrayList<>();
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
							even.addAll(Arrays.asList(a2[i]));
						}
						else
						{
		    					c2++;
							odd.addAll(Arrays.asList(a2[i]));
						}
					}
					System.out.println("No. of Even= "+c1);
					System.out.println("Even no. = "+even);
					System.out.println("No. of Even= "+c2);
					System.out.println("Odd no. = "+odd);
					break;
				case 2:
					List<Integer> composite=new ArrayList<>();
					System.out.print("Enter no. of integers: ");
					n=sc.nextInt();
					int a[]=new int[n];
					System.out.println("Enter integers: ");
					for(i=0;i<n;i++)
					{
						a[i]=sc.nextInt();
					}
					int co=0,c=0;
					for(i=0;i<n;i++)
					{
						c=0;
    		    				for(j=1;j<=a[i];j++)
    		    				{
    		        				if(a[i]%j==0)
    		        				{
    		            				c++;
    		        				}
    		    				}
    		    				if(c>2)
    		    				{
    		        				co++;
    		        				composite.addAll(Arrays.asList(a[i]));
    		    				}
					}
					System.out.println("Composite no. = "+composite);
					System.out.println("No. of Even= "+co);
					break;
				case 3:
					System.out.print("Enter no. of integers: ");
					n=sc.nextInt();
					int z[]=new int[n];
					System.out.println("Enter integers: ");
					for(i=0;i<n;i++)
					{
						z[i]=sc.nextInt();
					}
					System.out.print("(");
					for(i=0;i<n;i++)
					{
						System.out.print("("+z[i]+","+z[i]*z[i]+")"+" ");
					}
					System.out.print(")");
					break;
				case 4:
					List<Integer> common=new ArrayList<>();
					System.out.print("Enter no. of integers for array1: ");
					n=sc.nextInt();
					int x[]=new int[n];
					System.out.print("Enter no. of integers for array2: ");
					m=sc.nextInt();
					int b[]=new int[m];
					System.out.println("Enter integers for array1: ");
					for(i=0;i<n;i++)
					{
						x[i]=sc.nextInt();
					}
					System.out.println("Enter integers for array2: ");
					for(i=0;i<m;i++)
					{
						b[i]=sc.nextInt();
					}
					for(i=0;i<n;i++)
					{
						for(j=0;j<m;j++)
						{
							if(x[i]==b[j])
							{
								common.addAll(Arrays.asList(x[i]));
							}
						}
					}
					System.out.println(common);
					break;
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
