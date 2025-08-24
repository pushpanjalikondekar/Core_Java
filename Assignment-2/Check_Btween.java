import java.util.Scanner;

public class Check_Btween{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter three Number: ");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();

	if((a > b && a < c) || (a < b && a > c))
    {
        System.out.println("is between "+a +b +c);
    }
    else
    {
         System.out.println(" is not between "+a +b +c);
    } 
  }
}