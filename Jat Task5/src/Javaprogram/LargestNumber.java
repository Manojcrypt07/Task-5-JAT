package Javaprogram;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter A ");
		a=sc.nextInt();
		
		System.out.println("Enter B ");
		 b=sc.nextInt();
		 
		System.out.println("Enter C ");
		 c=sc.nextInt();
		 
		 if(a > b && a > c)
	        {
	            System.out.println("Largest number is:"+a);
	        }
	        else if(b > c)
	        {
	            System.out.println("Largest number is:"+b);
	        }
	        else
	        {
	            System.out.println("Largest number is:"+c);
	        }
		 
	}

}
