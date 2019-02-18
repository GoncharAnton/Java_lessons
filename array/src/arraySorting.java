import java.util.Scanner;
public class arraySorting {

	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = value.nextInt();  //enter array size
		double []array = new double [size];
		
		// filling array
		for(int a = 0; a < size; a++){
			array[a] = value.nextDouble();
		}
		
		// array sorting & print it
		for (int a = size - 1; a >= 0; a--){
			for(int b = 0; b < a; b++){
				if(array[b]> array[b + 1]){
					double z = array[b ];
					array[b] = array[b +1 ];
					array[b+1] = z; 
				}
			}
			System.out.println(array[a]);
		}
		value.close();
	}
}
