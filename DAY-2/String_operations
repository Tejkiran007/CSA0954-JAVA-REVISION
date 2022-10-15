import java.util.*;
import java.io.IOException;
public class str_op
{
	static void removeDuplicate(char str[], int n)
    	{
        	HashSet<Character> s = new LinkedHashSet<>(n - 1);
        	for (char x : str)
            	s.add(x);
        	for (char x : s)
            	System.out.print(x);
    	}
  	public static void main(String[] args) 
	{
		try
		{
			String str;
			int i,ch,len,strLength;
			char a;
			String reverseStr = "";
			Scanner sc=new Scanner(System.in);
			Scanner s=new Scanner(System.in);
			System.out.println("1.Palindrome or not \n2.Reverse String \n3.Substring \n4.Remove duplicates");
			System.out.print("Enter choice: ");
			ch=s.nextInt();
			switch(ch)
			{
				case 1:
    					System.out.print("Enter the string: ");
					str=sc.nextLine();
					str=str.trim();
					len= str.length();
					for (i=0;i<len;i++)
        				{
            				a = str.charAt(i);
            				if (!(a >= 'A' && a <= 'Z') && !(a >= 'a' && a <= 'z') && !(a==' ')) 
            				{
                					System.out.println("Invalid String");
							return;
            				}
        				}
    					for (i = (len - 1); i >=0; --i) 
					{
      					reverseStr = reverseStr + str.charAt(i);
    					}
    					if(str.toLowerCase().equals(reverseStr.toLowerCase())) 
					{
      					System.out.println(str + " is a Palindrome String.");
    					}
    					else 	
					{
      					System.out.println(str + " is not a Palindrome String.");
    					}
					break;	
				case 2:
					System.out.print("Enter the string: ");
					str=sc.nextLine();
					str=str.trim();
					len= str.length();
					for (i=0;i<len;i++)
        				{
            				a = str.charAt(i);
            				if (!(a >= 'A' && a <= 'Z') && !(a >= 'a' && a <= 'z') && !(a==' ')) 
            				{
                					System.out.println("Invalid String");
							return;
            				}
        				}
    					for (i = (len- 1); i >=0; --i) 
					{
      					reverseStr = reverseStr + str.charAt(i);
    					}
    					System.out.println("Reverse of given string = "+reverseStr);
					break;
				case 3:
					System.out.print("Enter the string: ");
					str=sc.nextLine();
					str=str.trim();
					len= str.length();
					for (i=0;i<len;i++)
        				{
            				a = str.charAt(i);
            				if (!(a >= 'A' && a <= 'Z') && !(a >= 'a' && a <= 'z') && !(a==' ')) 
            				{
                					System.out.println("Invalid String");
							return;
            				}
        				}
					String[] splitString = str.split(" ");
					/*for (String z : splitString) 
					{
 						System.out.println(z);
					}*/
					System.out.println("Sub strings are: ");  
					System.out.println(Arrays.toString(splitString));  
					break;
				case 4:
					System.out.print("Enter the string: ");
					str=sc.nextLine();
					str=str.trim();
					len= str.length();
					for (i=0;i<len;i++)
        				{
            				a = str.charAt(i);
            				if (!(a >= 'A' && a <= 'Z') && !(a >= 'a' && a <= 'z') && !(a==' ')) 
            				{
                					System.out.println("Invalid String");
							return;
            				}
        				}
					char st[] =str.toCharArray();
        				int n = st.length;
        				removeDuplicate(st, n);
					break;
				default:
					break;
			}
		}
		catch(Exception e)
		{
			System.out.print(e);
			return;
		}
	}
}
