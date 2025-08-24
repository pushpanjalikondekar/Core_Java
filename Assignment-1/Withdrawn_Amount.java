import java.util.Scanner;

public class Withdrawn_Amount{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

	int amount = sc.nextInt();
	int ten , five, one;
	

	System.out.println("Enter the amount to be withdrawn :");
	ten = amount/10;
	amount = amount %10;

	five = amount/5;
	amount = amount %5;

	one = amount;

	System.out.println("Number of 10 rupee notes :"+ten);
	System.out.println("Number of 5 rupee notes :"+five);
	System.out.println("Number of 1 rupee notes :"+one);

	}
}