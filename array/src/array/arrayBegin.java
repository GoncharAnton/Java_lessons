package array;
import java.util.Scanner;

public class arrayBegin {

	public static void main(String[] args) {
		
		Scanner value = new Scanner(System.in);
		System.out.println("enter array size value: ");
		int size = value.nextInt();
		double []array = new double[size];
		
		//filling array
		System.out.println("When fill double array used ',' \n" + "Let's fill array: \n" );
		for(int a = 0; a < size; a++){
			double var = value.nextDouble();
			array[a] = var; 
		}
		
		// print reverse array
		System.out.println("here is reverse array: ");
		for(int a = size; a > 0; a--)
			System.out.println(array[a - 1]);
		value.close();
	}
}