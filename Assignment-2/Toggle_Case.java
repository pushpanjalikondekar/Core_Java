import java.util.Scanner;

public class Toggle_Case{
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter a Single Character:");

	char ch = sc.next().charAt(0);

	if (ch >= 'a' && ch <= 'z'){
		char upper =(char) (ch-32);
	System.out.println("Upper Case:" +upper);
	}
	else if (ch >= 'A' && ch <= 'Z'){
		char lower = (char)(ch - 32);
	System.out.println("Lower Case:" +lower);
	}
	else {
		System.out.println("Invalid Input!");
	}
    }
}