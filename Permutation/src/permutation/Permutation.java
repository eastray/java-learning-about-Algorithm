package permutation;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Permutation perm = new Permutation();

		perm.permute("ABCD");

	}

	private void permute(String full) {
		if (full == null || full.length() == 0) {
			System.out.println("You must provide a string of length > 0.");
			return;
		}

		permute("", full);
	}

	private void permute(String prefix, String remainder) {

		if (remainder.length() == 0) {
			System.out.println(prefix);
			return;
		}

		for (int i = 0; i < remainder.length(); i++) {
			permute(prefix + remainder.charAt(i),
					remainder.substring(0, i) + remainder.substring(i + 1, remainder.length()));
		}
	}

}
