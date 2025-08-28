import java.util.Scanner;

public class ArithematicOperation{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter a Expersion: ");
		int x = sc.nextInt();
		char op = sc.next().charAt(0);
		int y = sc.nextInt();
		
		switch(op){
			case '+' -> System.out.println(a + " " + op + " " + b + " = " +(x + y));
			case '-' -> System.out.println(a + " " + op + " " + b + " = " +(x - y));
			case '*' -> System.out.println(a + " " + op + " " + b + " = " +(x * y));
			case '/' -> System.out.println(a + " " + op + " " + b + " = " +(x / y));
			default  -> System.out.println("Invalid Operator !");			
		}
	}
}