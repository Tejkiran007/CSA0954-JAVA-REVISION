import java.util.*;
interface GPI 
{
	default void show()
	{
		Scanner sc=new Scanner(System.in);
		double ch,et,to,p,c,m,ph,a;
		System.out.print("Enter the python marks: ");
		p=sc.nextDouble();
		System.out.print("Enter the c programming marks: ");
		c=sc.nextDouble();
		System.out.print("Enter the Maths marks: ");
		m=sc.nextDouble();
		System.out.print("Enter the Physics marks: ");
		ph=sc.nextDouble();
		System.out.print("Enter the Chemistry marks: ");
		ch=sc.nextDouble();
		System.out.print("Enter the Professional Ethics marks: ");
		et=sc.nextDouble();
	      if(p<0 || c<0 || m<0 || ph<0 || ch<0 || et<0 || p>100 || c>100 || m>100 || ph>100|| ch>100 || et>100)
		{
			System.out.print("Invalid input");	
			return;
		}
		if(p<50 || c<50 || m<50 || ph<50 || ch<50 || et<50)
		{
			System.out.print("Grade: Fail");	
			return;
		}
		to=p+c+m+ph+ch+et;
		a=(to/600)*100;
		System.out.println("Total= "+to);
		System.out.println("Aggregate= "+a);
		if(a>=75)
		{
			System.out.println("Distincttion");
		}
		if(a>=60 && a<75)
		{
			System.out.println("First Division");
		}
		if(a>=50 && a<60)
		{
			System.out.println("Second Division");
		}
	}
}

interface PI1 extends GPI 
{
}

interface PI2 extends GPI 
{
}

class grade implements PI1, PI2
 {
	public static void main(String args[])
	{
		grade d = new grade();
		d.show();
	}
}
