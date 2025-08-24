import java.util.Scanner;
public class PerviousNextCharacter{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter a Character:");
	char ch = sc.next().charAt(0);

	char pereviousChar = (char) (ch - 1);
	char nextChar = (char) (ch + 1);

	System.out.println("The pereviou Chracter is : "+pereviousChar);
	System.out.println("The next Character is : "+nextChar);
     }
}