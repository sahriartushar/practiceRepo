package Assignment3;

public class SwapValue {

	public static void main(String[] args) {
		
		int x = 90;
		int y = 60;
		
		System.out.println("Before The Swap");
		System.out.println(" x= " + x  +  "  y= " + y);
		
		int temp;
		
		temp = x;
		
		x = y;
		
		y = temp;
		
		System.out.println("After The Swap");
		System.out.println(" x= " + x  +  "  y= " + y);
		

	}

}
