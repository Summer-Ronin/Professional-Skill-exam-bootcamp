package Lab_01;

import java.util.Scanner;

public class Exercise03 {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Please input length: ");
			int len = input.nextInt();
			
			System.out.print("Please input width: ");
			int wid = input.nextInt();
			
			System.out.println("Area: " + String.valueOf(len * wid));
			System.out.println("Perimeter: " + String.valueOf(2 * (len + wid)));
		}
		catch(Exception e){
			System.out.print("Something went wrong with " + e);
		}
	}
	
}
