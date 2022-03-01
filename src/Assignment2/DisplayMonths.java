package Assignment2;

import java.util.Scanner;

public class DisplayMonths {

	public static void main(String[] args) {
		
		int Month ;
		System.out.println("Enter the Number");
		
		
		
		@SuppressWarnings("resource")
		Scanner month = new Scanner(System.in);
		Month = month.nextInt();
		
		
		switch  (Month){
			
		case 1: 
			System.out.println("January");
			break;
			
		case 2:
			System.out.println("February");
			break;
			
		case 3:
			System.out.println("March");
			break;
			
		case 4:
			System.out.println("April");
			break;
			
		case 5:
			System.out.println("May");
			break;
			
		default:
			System.out.println("This is Summer");
		}

	}

}
