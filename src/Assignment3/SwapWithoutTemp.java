package Assignment3;

public class SwapWithoutTemp {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 15;
		
		System.out.println("    Before Swapping:");
		System.out.println("    x = " + x);
		System.out.println("    y = " + y);
		
		System.out.println();
		
		x = x + y;
		y = x - y;
		x = x - y;
		
		System.out.println("    After Swapping:");
		System.out.println("    x = " + x);
		System.out.println("    y = " + y);

	}

}
