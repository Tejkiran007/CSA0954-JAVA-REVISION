import java.util.*;
public class weeke
{
	public int[] orderIndexAscending(int[] array) 
	{
        	int[] minimumIndexes = new int[array.length];
        	int[] sortedArray = array.clone();
        	Arrays.sort(sortedArray);
        	for (int index = 0; index < array.length; index++)
		{
            	int minIndex = 0;
            	for (int number : array) 
			{
                		if(number == sortedArray[index]) 
				{ 
                    		minimumIndexes[index] = minIndex;
                    		break;
                		}
                		minIndex++;
            	}
		}
        	return minimumIndexes;
    	}
	public static void main(String[] args)
	{
		try
		{
		int i,j,n=5,c,k;
		List<Integer>prin_t=new ArrayList<>();
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
		System.out.print("Enter k: ");
		k=s.nextInt();
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
		/*for(i=0;i<n;i++)
		{
			System.out.print(" "+x[i]);
		}*/
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
		System.out.println("\nWeakest row = "+index);
		weeke finder = new weeke();
        	int[] indixes = finder.orderIndexAscending(x);
        	System.out.println("Indexes of the array in ascending order: "+Arrays.toString(indixes));
		for(i=0;i<k;i++)
		{
			prin_t.addAll(Arrays.asList(indixes[i]));
		}
		System.out.println(prin_t);
		}
		catch(Exception e)
		{
			System.out.println("Invalid");
			System.out.println(e);
		}
    	}
}
