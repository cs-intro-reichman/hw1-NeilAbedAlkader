// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		int num = Integer.parseInt(args[0]);
		int hundreds = (num / 100) % 10;
		int tens = (num / 10) % 10;
		int ones = num % 10;

		System.out.println("Hundreds: " + hundreds +", Tens: " + tens+", Ones: " + ones);
}


	}
}
