import java.util.Scanner;

public class TestAlgorithm {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		// Enter the two intrgers 
		System.out.println("Enter two integers to get GCD and LCM for them ");
		int number1 = input.nextInt();
		int number2= input.nextInt();
		// cluc GCD 
		int GCD = Algorithm.gcd(number1, number2) ;
		System.out.println("The GCD is "+GCD);
		// cluc LCM 
		int LCM = Algorithm.LCM(number1, number2, GCD); 
		System.out.println("The LCM is "+LCM);
	}
}
