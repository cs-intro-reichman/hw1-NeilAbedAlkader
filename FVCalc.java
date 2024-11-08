// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){

		double intrest = Double.parseDouble(args [1]);
		int saving = Integer.parseInt(args[0]);
		int years = Integer.parseInt(args[2]);
		int futurevalue = (saving *  (int)Math.pow((1 + intrest), years))/100;
		System.out.println("after " + years + "years, $" + saving + " saved at %" + intrest + " will yield $" + futurevalue);


	}
}