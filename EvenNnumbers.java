package while_loop;

public class EvenNnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		print(7);
	}
	public static void print(double n) {
		double i = 0.0;
		while (i<n) {
			System.out.print(i+ " ");
			i=i+2;
		}
		System.out.println(i+ "Final");
	}
}

