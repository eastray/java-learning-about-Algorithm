package nineNineDan;

import java.util.Scanner;

public class NineNineDan {

	private void recusion(int n, int m) {

		System.out.println(n + " x " + m + " = " + n * m);

		if (m < 9)
			recusion(n, m + 1);

	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NineNineDan nnd = new NineNineDan();

		Scanner sc = new Scanner(System.in);

		nnd.recusion(sc.nextInt(), 1);
	}

}
