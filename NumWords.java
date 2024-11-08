// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		int num = Integer.parseInt(args[0]);
		String[] numScaleNames = {"", "Tens", "Hundreds", "Thousands", "Ten Thousands", "Hundred Thousands", "Millions", "Ten Millions", "Hundred Millions", "Billions", "Trillions"};
		int pointer=0;
		while(num>0){
			System.out.print(num%10 + " " + numScaleNames[pointer] + ", ");
			num -= num%10;
			num /= 10;
			pointer++;

		}


	}
}
