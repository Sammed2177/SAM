// Q.add static variable banner = "welcome to IMS"
// Create static method that display static variable value
// Call static method in main.

package lab_1;

public class Banner 
{
	String name;
	static String ban = "Welcome to IMS"; 
	
	static void get()
	{
		System.out.println(ban);
	}
	public static void main(String a[])
	{
		Banner b = new Banner();
		b.get();
	}
}
