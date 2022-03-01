package Assignment2;

public class AddOddNumbers {

	public static void main(String[] args) {
		
		int sum = 0;
		
		System.out.println("    Odd Numbers: ");
		
		for (int i = 51; i<70;  i=i+2) {
			sum = sum + i;
				
			System.out.println(i);
			
		}
			System.out.println("    Summation of Odd Numbers is : " + sum);
	}

}
