// Splits a restaurant bill evenly among three diners.
public class Bill3 {
		public static void main(String[] args) {
			int bill = Integer.parseInt(args[0]);
			String name1 = args[1];
			String name2 = args[2];
			String name3 = args[3];

			double sum = bill;
			double each = Math.ceil(sum / 3.0);

			System.out.println("Dear " + name1 + ", " + name2 + ", " + name3 + ", " + each + " Shekels each");
		}
	}
