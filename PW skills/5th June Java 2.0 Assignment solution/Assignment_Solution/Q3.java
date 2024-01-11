package ai.ineuron.StringAssignment;

public class UpperToLowerCase {
	public static void main(String[] args) {
		String S1 = "ineuron";
		String S2 = "";
		for (int i = 0; i < S1.length(); i++) {
			if ((S1.charAt(i) >= 'a') && (S1.charAt(i) <= 'z')) {
				S2 = S2 + (char) (S1.charAt(i) - 32);

			} else if ((S1.charAt(i) >= 'A') && (S1.charAt(i) <= 'Z')) {
				S2 = S2 + (char) (S1.charAt(i) + 32);

			}

		}
		System.out.println(S2);
	}

}
