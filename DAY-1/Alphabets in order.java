import java.util.*;
public class alphaord
{
	public static void main(String[] args)
	{	
		Scanner sc=new Scanner(System.in);
		Scanner s=new Scanner(System.in);
		int n,i,j;
		System.out.print("Enter the no. of names:  ");
		n=sc.nextInt();
		String names[]=new String[n];
		System.out.println("Enter names:  ");
		for(i=0;i<n;i++)
		{
			names[i]=s.nextLine();
			if(names[i]!= null && names[i].matches("^[a-zA-Z]*$"))
			{
				System.out.print("");
			}
      		else
			{
         			System.out.println("Invalid");
				return;
			}
		}
		String temp;
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{	
				if(names[i].compareTo(names[j])>0)
				{
					temp=names[i];
					names[i]=names[j];
					names[j]=temp;
				}	
			}
		}
		System.out.println("In order: ");
		for(i=0;i<n;i++)
		{
				System.out.println(names[i]);
		}
	}
}
