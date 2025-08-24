import java.util.Scanner;

public class DivisibleBy5and7{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter a Number:");
	int num = sc.nextInt();

	if(num%5==0)
    
        if(num%7==0)
{
        System.out.println(" is divisible by both 5 and 7 "+num);
    }
    else
    {
        System.out.println(" divisible by 5 but not by 7 "+ num);
    }
    else{
        System.out.println(" divisible by 7 but not by 5 "+ num);
    }
  }
}	

	