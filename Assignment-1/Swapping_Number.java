import java.util.Scanner;
public class Swapping_Number{
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Accept the Number From User ");
	int a = sc.nextInt();
	int b = sc.nextInt();

	System.out.println("Before Swapping Number : a = " +a+ ",b = " +b);
	a = a + b;
	b = a - b;
	a = a - b;

	System.out.println("After Swapping Number: a = " +a+ ", "+b);
	a = a * b;
	b = a / b;
	a = a / b;

	System.out.println("After Swapping Number : a = " +a+ ", "+b);

	}
}