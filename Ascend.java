// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int a =(int) (Math.random() * 2147483646); // the limit of int is 2147483647
		int b = (int) (Math.random() * 2147483646);
		int c = (int) (Math.random() * 2147483646);
		System.out.println(Math.max(a, Math.max(b, c)) + ", " + (a + b + c - Math.min(a, Math.min(b, c)) - Math.max(a, Math.max(b, c))) + ", " +

	}
}
