import java.util.Scanner;
public class CharacterCheck{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter a Character:");
	char ch = sc.next().charAt(0);

	int asccii = (int) ch;
	
	if(asccii >= 48 && asccii <= 57){
	System.out.println("is a digit" +ch);
	}
	else if(asccii >= 65 && asccii <= 90){
		System.out.println("is a uppercase letter"+ch);
	}
	else if(asccii >= 97 && asccii <= 122){
		System.out.println("is a lowercase letter" +ch);
	}
	else{
		System.out.println("Invalid Input!");
	}
    }
}
		
		