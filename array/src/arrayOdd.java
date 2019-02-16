import java.util.Scanner;
public class arrayOdd {

	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		int var;
		System.out.println("enter array size: ");
		//enter array size
		int size = value.nextInt();
		int []array = new int [size];
		
		// filling array
		System.out.println("array variable should by unsigned integer value!");
		System.out.println("enter array variable: ");
		for(int a = 0; a < size; a++){
			var = value.nextInt();
			array[a] = var;
		}
		
		//print add value
		System.out.println("here is odd value!");
		for(int a = 0; a < size; a++){
			if((array[a] % 2)!= 0)
				System.out.println(array[a]);
		}
		value.close();
	}
}
