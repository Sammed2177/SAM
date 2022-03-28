//Q 2 write a program that defines two variables and print their sum .

package core_self_elv_lab;

public class Quation_2 {
	
	int sum(int a,int b)
	{
		return a+b;
	}
	
	public static void main(String a[])
	{
		Quation_2 q = new Quation_2();
		int c = q.sum(13, 40);
		System.out.println("sum of two given numbers is "+c);
	}

}
