package sumFromOneToN;

import java.util.Scanner;

public class sumFromOneToN {

	public static void main(String[] args) {
		System.out.println("This app return sum of integer value from 1 to  N!");
		int a = 0, b;
		b = filling();
		System.out.println("the sum fro 0 to " + b + " is " + sum(b));
	}
	//checking correct enter value
	public static int filling(){
		Scanner in = new Scanner(System.in);
		int b;
		do{
			System.out.println("value should be unsigned, integer value from 1 to 100");
			System.out.println("Please, enter value: ");
			b = in.nextInt();
			if((b <= 0)||(b > 100))
				System.out.println("wrong value, please read instruction & try again!");
		}while((b <= 0)||(b > 100));
		System.out.println("Nice)");
		return b;
	}
	// sum integer value from 1 to N
	public static int sum(int b){
		int sum = 0;
		for(int a = 1; a <= b; a++)
			sum += a; 
		return sum;
	}

}
