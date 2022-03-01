package Assignment2;

public class AddEvenUsingFor {

	public static void main(String[] args) {
		
		
		int sum = 0;
		
		System.out.println("Even Numbers:");
		
		for ( int i= 2;  i<=20; i= i+2) {
				
		sum = sum + i;
		
		
		System.out.println(i);
		
		}
		
				System.out.println("Summation of Even Numbers: " + sum);
		

	}

}
