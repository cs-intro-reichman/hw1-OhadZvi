// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int a = (int) (Integer.parseInt(args[0]) * Math.random());
		int b = (int) (Integer.parseInt(args[0]) * Math.random());
		int c = (int) (Integer.parseInt(args[0]) * Math.random());
		System.out.println(a + " " + b + " " + c);
		int min = Math.min(Math.min(a, b), c);
		int max = Math.max(Math.max(a, b), c);
		int mid = a + b + c - min - max;
		System.out.println(min + " " + mid + " " + max);
	}
}
