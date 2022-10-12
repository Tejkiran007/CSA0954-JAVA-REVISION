import java.util.*;
interface PI1 {
 
    default void show()
    {
	Scanner sc=new Scanner(System.in);
	int x;
        System.out.println("Enter the Base x: ");
	x=sc.nextInt();
	 System.out.println("Base x=  "+x);
    }
}
 

interface PI2 {
 
    default void show()
    {
 
        Scanner sc=new Scanner(System.in);
		int y,x;
        System.out.println("Enter the  Derived y: ");
		y=sc.nextInt();
	System.out.println("Derived y=  "+y);
    }
}
 

class override implements PI1, PI2 {
 
    public void show()
    {
 
        PI1.super.show();
 
        PI2.super.show();
    }
 
    public static void main(String args[])
    {
 
        override d = new override();
        d.show();
    }
}
