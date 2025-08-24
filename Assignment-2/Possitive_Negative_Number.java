import java.util.Scanner;
public class Possitive_Negative_Number{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter a Number:");
	int num = sc.nextInt();

	if(num > 0){
	System.out.println("The Number is Possitive:" +num);
	}

	else if (num < 0){
	System.out.println("The number is  negative:");
	}

	else{
	System.out.println("The number is possitivr or Negative:"+num);
	}

     }
}