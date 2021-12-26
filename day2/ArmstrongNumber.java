package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int input = 153;
		int sum = 0 ;
		int rem ;
		int original = input ;
		
		while (153>0) {
			rem = input % 10 ;
			
			sum = sum +(rem*rem*rem) ;
			input = input / 10 ;
		if (sum == original)
		{
			
			System.out.println("Given number is armstrong");
		}
		else {
			System.out.println("given number is not armstrong");
		}
			
			
			

			
			
		}
		
		
		
		

	}

}
