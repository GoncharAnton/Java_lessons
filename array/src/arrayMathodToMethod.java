import java.util.*;
public class arrayMathodToMethod {

	static Scanner value = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("enter size value: ");
		int size = value.nextInt();//enter array size
		double []array = new double [size];
		fillingArray(array,size);
		
	}
	public static void fillingArray(double array[], int size){
		//filling array
		System.out.println("let`s filling array : ");
		System.out.println("Array value should by double value!");
		for(int a = 0; a < size; a++){
			array[a] = value.nextDouble();
		}
		//print full array
		for(int a = 0; a < size; a ++){
			if(a != (size - 1))
				System.out.print(array[a] + ", ");
			else
				System.out.println(array[a] + ";");
		}
		sortingArray(array, size);
	}
	public static void sortingArray(double array[], int size){
		// sorting array
		for (int a = size - 1; a >= 0; a--){
			for(int b = 0; b < a; b++){
				if(array[b]> array[b + 1]){
					double z = array[b];
					array[b] = array[b +1];
					array[b+1] = z;
				}
			}
		}
		//print full array
		for(int a = 0; a < size; a++){
			if(a < (size -2))
				System.out.print(array[a] + ", ");
			else
				System.out.print(array[a]+ ". ");
		}
	}
	
}
