import java.util.*;
interface PI1 {
 
    // Default method
    default void show()
    {
	Scanner sc=new Scanner(System.in);
	int x;
        System.out.println("Enter Base x: ");
	x=sc.nextInt();
	 System.out.println("Base x=  "+x);
    }
}
 
// Interface 2
interface PI2 {
 
    // Default method
    default void show()
    {
 
        Scanner sc=new Scanner(System.in);
		int y,x;
        System.out.println("Enter Derived y: ");
		y=sc.nextInt();
	System.out.println("Derived y=  "+y);
    }
}
 
// Main class
// Implementation class code
class override implements PI1, PI2 {
 
    // Overriding default show method
    public void show()
    {
 
        // Using super keyword to call the show
        // method of PI1 interface
        PI1.super.show();
 
        // Using super keyword to call the show
        // method of PI2 interface
        PI2.super.show();
    }
 
    // Mai driver method
    public static void main(String args[])
    {
 
        // Creating object of this class in main() method
        override d = new override();
        d.show();
    }
}
