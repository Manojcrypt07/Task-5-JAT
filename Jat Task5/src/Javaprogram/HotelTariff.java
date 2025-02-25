package Javaprogram;
import java.util.Scanner;
public class HotelTariff {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter month \n");
		int month =sc.nextInt();
		System.out.println("Eneter Rent \n");
		float rent=sc.nextFloat();
		System.out.println("Eneter Days \n");
		int days=sc.nextInt();
			if (month<1 || month>12) {
			System.out.println("The month you entered is Invalid ");
			return;
		}
	switch(month) {
	case 1:
	case 2:
	case 3: break;
	case 4:
	case 5:
	case 6:
		rent *=1.20;
		break;
	case 7:
	case 8:
	case 9:
	case 10: break;
	case 11:
	case 12:
		rent *=1.20;
	break;
	default :
		System.out.println("Invalid month");
			break;
		}
		float Total=rent*days;
		System.out.printf("Total amount to be paid is %.2f ", Total);
	}}
