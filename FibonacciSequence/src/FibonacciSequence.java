import java.util.Scanner;
public class FibonacciSequence {

	public static void main(String[] args) {
		int a = check();
		fibo(a);
		System.out.println("https://en.wikipedia.org/wiki/Fibonacci_number");
	}
	
	//checking correct enter value
	public static int check(){
		Scanner vl = new Scanner(System.in);
		int value = 0;
		do{
			System.out.println("Enter Fibonacci sequence iteration number.");
			System.out.println("Iteration number should by unsigned integer value from 1 to 45");
			value =  vl.nextInt();
			if((value < 1)||(value > 45))
				System.out.println("wrong value, please try again!");
		}while((value < 1)||(value > 45));
		vl.close();
		return value;
	}
	
	// make Fibonacci sequence
	public static void fibo(int a){
		int fibo1 = 0, fibo2 = 1, fibo3 = 0;
		for(int i = 0; i <= a; i++){
			if(i == 0)
				System.out.println(" F " + i + "  -  " + fibo1);
			else if(i == 1)
				System.out.println(" F " + i + "  -  " + fibo2);
			else{
			fibo3 = fibo1 + fibo2;
			fibo1 = fibo2;
			fibo2 = fibo3;
			System.out.println(" F " + i + "  -  " + fibo3);
			}
		}
	}
}
