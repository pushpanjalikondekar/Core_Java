import java.util.Scanner;

public class CompareNumber{
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter first Number:");
	int num1 = sc.nextInt();

	System.out.println("Enter second Number:");
	int num2 = sc.nextInt();

	if(num1 == num2){
		System.out.println(+num1" is equal to:"+num2);
	}

	else if(num1 > num2){
		System.out.println(+num1" is Greter than:"+num2);
	}

	else{
		System.out.println(+num1"is Less than:"+num2);
	}
    }
}
	 