import java.util.Scanner;
public class CharacterToASCII{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter a Character:");
	char ch = sc.next().charAt(0);

	int asciiValue =(int) ch;

	System.out.println("The Ascii Value Of:'"+ ch +"' is:" +asciiValue);
    }
}