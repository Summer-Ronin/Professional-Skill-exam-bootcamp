package Lab_01;
import java.util.Scanner;

public class Exercise01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input name: ");
		String name = input.nextLine();
		
		System.out.print("Please input day of birth: ");
		String dob = input.nextLine();
		
		System.out.print("Please input phone number: ");
		String phoneNumber = input.nextLine();
		
		System.out.print("Hello " + name + " with " + dob + " with phone number of " + phoneNumber);
	}
}
