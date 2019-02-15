
public class SquareRandom {

	public static void main(String[] args) {
		int a = 0, b = 100;
		int sqr = a + (int)(Math.random()* b);
		System.out.print("The sqere of " + sqr + " is " );
		sqr *= sqr;
		System.out.println(sqr);
	}
}
