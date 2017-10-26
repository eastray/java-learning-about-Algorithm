package factorial;

import java.util.Scanner;

public class Factorial {

	private int factorial(int n) {
		
		if(n == 1)
			return 1;

		return n * factorial(n - 1);
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Factorial factorial = new Factorial();

		Scanner scanner = new Scanner(System.in);

		System.out.println("result: " + factorial.factorial(scanner.nextInt()));

	}

}
