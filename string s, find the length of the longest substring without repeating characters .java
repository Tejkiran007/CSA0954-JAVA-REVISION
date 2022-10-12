import java.io.*;
import java.util.Scanner;

class substring {
	public static int longestUniqueSubsttr(String str)
	{
	    
		String test = "";

	
		int maxLength = -1;

	
		if (str.isEmpty()) {
			return 0;
		}
		
		else if (str.length() == 1) {
			return 1;
		}
		for (char c : str.toCharArray()) {
			String current = String.valueOf(c);

			
			if (test.contains(current)) {
				test = test.substring(test.indexOf(current)
									+ 1);
			}
			test = test + String.valueOf(c);
			maxLength = Math.max(test.length(), maxLength);
		}

		return maxLength;
	}
	

	
	public static void main(String[] args)
	{
	   
	    String str;
	    Scanner sc= new Scanner (System.in);
	    System.out.println("enter the data:");
	    
	    str=sc.nextLine();
		System.out.println("The input string is " + str);

		int len = longestUniqueSubsttr(str);
		System.out.println("The length of the substring is:" + len);
	}


}
