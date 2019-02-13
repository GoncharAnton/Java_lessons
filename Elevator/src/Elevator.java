import java.util.Scanner;

public class Elevator {

	public static void main(String[] args) {
		int Floor = floorNum();
		elevator(Floor);
	}
	
	//checking correct enter value
	public static int floorNum(){
		int a;
		Scanner in = new Scanner (System.in);
		do{
			System.out.println("The floor nubber should by unsigned,integer value from 1 to 9!");
			System.out.println("enter floor number :");
			a = in.nextInt();
			if((a < 1)||(a > 9))
				System.out.println("Wrong value! Please read instruction & try again!");
		}while((a < 1)||(a > 9));
		return a;
	}
	
	//elevator program body
	public static void elevator(int Floor){
		final int PASS = 1337;
		int pass;
		Scanner in = new Scanner (System.in);
		if (((Floor >= 1)&&(Floor <= 3))||((Floor >= 7)&&(Floor <= 9)))
			System.out.println(" ok! ");
		else if((Floor >= 4)||(Floor <= 6 )){
			System.out.println("please enter password: ");
			pass = in.nextInt();
			if(PASS == pass)
				System.out.println("ok!");
			else
				System.out.println("Wrong password!");
		}
		in.close();
	}
}
