package Lab_01;

import java.util.Scanner;

public class Exercise04 {
	private static Scanner scanner;

	public static void main(String[] args) {
		System.out.print("Input number of days: ");
		scanner = new Scanner(System.in);
		String inputDate = scanner.nextLine();
		
		// convert String to float
		float dateFloat = Float.parseFloat(inputDate);
		// divide them to corresponding 
		float years = dateFloat / 365;
		float months = (dateFloat % 365) / 7;
		float days = dateFloat % 365;
		
		System.out.println(String.format("%.2f", years) + " years " + String.format("%.2f", months) + " months " + String.format("%.2f", days) + " days ");
	}
}
