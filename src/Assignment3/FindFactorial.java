package Assignment3;

import java.util.Scanner;

public class FindFactorial {

	public static void main(String[] args) {
		
		int fact = 1 ;
		int value = 26 ;
		
		System.out.println(" Enter the Number ");
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		value = in.nextInt();
		
		if ( value <0) {
			System.out.println(" Please Enter a number greater than 0");
		}
		
		else {
			
		for ( int i = 1; i <= value; i++ ) {
			
			fact = fact * i;
		
		}
			
		System.out.println("  Factorial value is : " + fact);
		
		}
		
		
	}

}
