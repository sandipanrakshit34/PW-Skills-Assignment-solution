package ai.ineuron.StringAssignment;

public class StringReverse {
	public static void main(String[] args) {
		String name = "Hello hi";
		String reverse="";

		for (int i = name.length() - 1; i >=0; i--) {
			char chaar = name.charAt(i);
			reverse = reverse + chaar;
		}
		System.out.println(reverse);
	}
}
