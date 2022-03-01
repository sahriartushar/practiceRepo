package Assignment3;

import java.util.Scanner;

public class FindFibonacchi {

	public static void main(String[] args) {
		int first = 0;
		int second = 1;
		int n;
		
		System.out.println(" Enter how many Fibonnaci numbers to print ");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		System.out.println(" First " + n + " Numbers of Fibonacchi Series" );
		
		for(int i = 1; i <= n; i++ ) {
			System.out.print( first + ",");
			
			int next = first + second;
			
			first = second;
			second = next;
			
			
			
		}
		
		
	}

}
