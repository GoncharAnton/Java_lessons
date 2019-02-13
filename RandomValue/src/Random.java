
public class Random {

	//random value from 0 to 100
	public static void main(String[] args) {
		int a = 0, b = 100;
		int value = a + (int)(Math.random() * b);
		System.out.println("random value is - " + value);
	}

}
