package Lab_01;

import java.util.Scanner;

public class Exercise02 {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Please input 1st number: ");
			int firstNumber = input.nextInt();
			
			System.out.print("Please input 2nd number ");
			int secondNumber = input.nextInt();
			
			System.out.println("Addition: " + String.valueOf(firstNumber + secondNumber));
			System.out.println("Substraction: " + String.valueOf(firstNumber - secondNumber));
			System.out.println("Multiplication: " + String.valueOf(firstNumber * secondNumber));
			System.out.println("Division: " + String.valueOf(firstNumber / secondNumber));
		}
		catch(Exception e){
			System.out.print("Something went wrong with " + e);
		}
	}
}
