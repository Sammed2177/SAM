//Q. WAP to design class for inventory having fields like product name, price and quantity.
//--design two method input() that ask data from user
//--design another method show() that display data
//--design another method calculate() discount
//--if price > 3000 then print discount is 10 % else 9% .
//--In main create object of class and call above method.

package lab_1;

import java.io.InputStream;
import java.util.Scanner;

public class Inventry {
		
	
	void disp(String s, int a)
	{
		System.out.println("Name of the product is "+s);
		System.out.println("Price of the product is "+a);
	}
	
	void discount(int a)
	{
		if (a > 3000)
		{
			System.out.println("Discount is 10 percent as price is more than 3000");
			int b = a-(a*10/100);
			System.out.println("Discounted price is "+b);
		}
		else
		{
			System.out.println("Discount is 9 percent as price is less than 3000");
			int c = a-(a*9/100);
			System.out.println("Discounted price is "+c);
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name of the product ");
		String name = scan.next();
		System.out.println("Enter price of the product ");
		int price = scan.nextInt();
		Inventry i = new Inventry();
		i.disp(name, price);
		i.discount(price);
	
	}

}
