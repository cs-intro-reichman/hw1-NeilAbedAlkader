// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){

		double intrest = Double.parseDouble(args [1]);
		int saving = Integer.parseInt(args[0]);
		int years = Integer.parseInt(args[2]);
		double a =intrest/100;
		double futureValue = saving * Math.pow(1 + a, years);
		System.out.println("After " + years + " years, a $" + saving + " saved at " + intrest + "% will yield $" + (int)futureValue);


	}
}
