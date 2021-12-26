package week1.day2;

public class Calculator {
	
	public int sub(int n1,int n2) {
		
  return n1-n2 ;
	}
	
	public int multiply(int n3, int n4) {
		
return n3*n4 ;
	}
	
	public int divide(int n5, int n6) {
		return n5/n6 ;

	}

	public static void main(String[] args) {
		Calculator calc = new Calculator ();
		int sub = calc.sub(30,20);
		int multiply = calc.multiply(3,20);
		int divide = calc.divide(30,10);
		System.out.println(sub);
		System.out.println(multiply);
		System.out.println(divide);
	}

}
