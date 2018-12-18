package Excercises;

public class Iteration 

{
	
	public static void Factorial(int num)
	{
		int factorial =1;
		for (int i = 1; i < num +1; i++) {
			factorial *=i;
		}
		System.out.println("Factorial of " + num + " is : " + factorial);
	}

	
	public static void AstrixTriangle(int n)
	{
		for (int row = 0; row <= n; row++) {
			for (int col =0; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		System.out.println("Printing Triangle finished");
	}
	
	
	public static void AstrixSymettricTriangle(int n)
	{
		for (int row = n; row > 0; row--) {
			
			for (int i = 0; i < n-row; i++) {
				System.out.print(" ");
			}
			for (int i = 0; i < ((2*row) - 1); i++) {
 				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void NoOfDigitsOfDecimalRepresentation(int n)
	{
		int result = 0 ;
		int newN = n;
		while (newN > 0) {
			newN = newN/10;
			result +=1;	
		}
		System.out.println("Number of Digists of " + n + " as decimal representation are "  + result);
	}
	
	public static void FibonacciSeries(int n)
	{
		int a = 0 ;
		int b = 1;
		int temp = 0;
		System.out.print("The Fibonacci serise less than " + n + " are: ");
		while (a < n) {
			System.out.print(a + " ");
			temp = a + b; 
			a = b;
			b = temp;
					
		}
				
	}
}
