package Sprint2Git;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.testng.annotations.Test;

public class Customer_order extends DrinkMenu {
	static Scanner sc=new Scanner(System.in);
	 static Map<String,Integer> order_map=new HashMap<String,Integer>();
	 static Double amount;
	public static void order_again(String s)
	{
		String st=s;
		 if(s.equals("Yes"))
		 {
			
			System.out.println(" please enter your order");
			String drink=sc.nextLine();
			System.out.println("enter quantity");
		int x=sc.nextInt();
		sc.nextLine();
		order_map.put(drink, x);
		System.out.println("Do you wantt add more.enter yes or no");
		String val=sc.nextLine();
		order_again(val);
		 }
			
		if(s.equals("no"))
		{
			System.out.println("plese wait for you order");
			System.out.println("your orders are:   "+order_map);
			try
			{
			amount=calculateamount(order_map);
			}catch(Exception e) {
				System.out.println("please check your order,enter correct items");
			}
			System.out.println("Your bill amount is:  "+amount);
		
		}
		
	}

 public static void main(String[] args)
 {
	
		DrinkMenu.menu_item();
	DrinkMenu.display_menu();
	
	//Scanner sc=new Scanner(System.in);
	System.out.println("PLEASE GIVE YOUR NAME OF ORDER");
	String name=sc.nextLine();
	System.out.println("Hello "+name+"  please enter your order");
	String drink=sc.nextLine();
	System.out.println("enter quantity");
	int x=sc.nextInt();
	order_map.put(drink, x);
	sc.nextLine();
	System.out.println("Do you wantt add more.enter yes or no");
	String option=sc.nextLine();
		order_again(option);
	
		
	
	
}
}