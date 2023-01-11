package Dec31;

import java.util.Scanner;
public class ifelse1 {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter two values..");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("In which mobile you wanna perform.?");
		System.out.println("\n\t1.Samsung\n\t2.Nokia");
		int c=s.nextInt();
		if(c==1)
			System.out.println(samsung(a,b)); 
		if(c==2)
			System.out.println(nokia(a,b));
	}
	public static int samsung(int a, int b) {
		System.out.println("Which operation you wanna do..?");
	    System.out.println("\n\t1.Addition\n\t2.Subtraction\n\t3.Multiplication");
		int m=s.nextInt();
		if(m==1)
			return a+b;
		else if(m==2)  
			return a-b;
		else 
			return a*b;
	}
	public static int nokia(int a, int b) {
		System.out.println("Which operation you wanna do..?");
	    System.out.println("\n\t1.Addition\n\t2.Subtraction\n\t3.Multiplication");
		int n=s.nextInt();
		if(n==1)
			return a+b;
		if(n==2)
			return a-b;
		if(n==3)
			return a*b;		
		return 0;
	}
}