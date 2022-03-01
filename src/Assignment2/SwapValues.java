package Assignment2;

public class SwapValues {

	public static void main(String[] args) {
		
		int x = 25 ;
		int y = 35 ;
		 
		System.out.println(" Befor Swap ");
		System.out.println(" x = " + x);
		System.out.println(" y = " + y);
		
		int tempvalue = x;
		x = y;
		y = tempvalue;
		
		System.out.println();
		System.out.println(" After Swap ");
		System.out.println(" x = " + x);
		System.out.println(" y = " + y);
		
	}

}
