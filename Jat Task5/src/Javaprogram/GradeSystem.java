package Javaprogram;
import java.util.Scanner;

public class GradeSystem {

	public static void main(String[] args) {
        System.out.println("Enter your score");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
 
        if (n == 100) {
            System.out.println("Grade is : S");
        }
        else if (n>90 && n<=99) {
            System.out.println("Grade is : A");
        }
        else if (n>80 && n<=89) {
            System.out.println("Grade is : B");
        }
        else if (n>=70 && n<=79) {
            System.out.println("Grade is : C");
        }
        else if (n>=60 && n<=69) {
            System.out.println("Grade is : D");
        }
        else if (n>=50 && n<=59) {
            System.out.println("Grade is : E");
        }
        else if (n<50) {
            System.out.println("Grade is : F");
        }
        else {
             System.out.println("Invalid Value");
        }
    	}
}
