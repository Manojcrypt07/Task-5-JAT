package Javaprogram;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		
		String str=sc.next();
		String ostr=str;
		String rev="";
		
		int len=str.length();
		
		for (int i=len-1; i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("The Reverse of the string is  : " +rev);
		
			

	}

}
