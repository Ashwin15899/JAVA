package Dec31;

import java.util.Scanner;
public class ifelse1 {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Welcome to laptops store...");
	    System.out.println("Enter yor budget..");
		double b=s.nextDouble();
		System.out.println("From where you wanna buy laptops");
		System.out.println("Press either 1 or 2");
		int c=s.nextInt();
		if(c==1)
			stores1(b);
		if(c==2)
			stores2(b);
	}	
	public static void stores1(double b) {
		if(b>=25000&&b<=50000) {
			System.out.println("Following laptops are available");
			System.out.println("\t1.Lenovo\n\t2.ACER\n\t3.ASUS ");
		}
		else if(b>50000&&b<=100000) {
			System.out.println("Following laptops are available");
			System.out.println("\t1.DELL\n\t2.HP\n\t3.MAC Book");
		}
		else {
			System.out.println("No Laptops available in your budget");
		}
	}
	public static void stores2(double b) {
		if(b>=25000&&b<=50000) {
			System.out.println("Following laptops are available");
			System.out.println("\t1.Lenovo\n\t2.ACER\n\t3.ASUS ");
		}
		if(b>50000&&b<=100000) {
			System.out.println("Following laptops are available");
			System.out.println("\t1.DELL\n\t2.HP\n\t3.MAC Book");
		}
		if(b<25000&&b>100000) {
			System.out.println("No Laptops available in your budget");
		}
	}
}
