package Assignment3;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		
		
		int value = 0;
		System.out.print("Enter The Number: ");
		
		@SuppressWarnings("resource")
		Scanner Value = new Scanner(System.in);
		value = Value.nextInt();
		
		if (value % 3 == 0) {
			System.out.println(" Fizz ");
		}
		else if (value % 5 == 0) {
			System.out.println(" Buzz ");
		}
		else if (value % 3 == 0 && value % 5 == 0){
			System.out.println(" FizzBuzz ");
		}
		
		else
			System.out.println(" Error ");

	}

}
