package recurrenceRelation;

import java.util.Scanner;

public class RecurrenceRelation {

	private int recurrenceRelation(int n) {
		
		if (n == 1)
			return 1;
		
		return recurrenceRelation(n-1) + n;
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RecurrenceRelation rr = new RecurrenceRelation();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(rr.recurrenceRelation(sc.nextInt()));
		
	}

}
