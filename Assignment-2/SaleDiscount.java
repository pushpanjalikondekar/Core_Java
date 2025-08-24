import java.util.Scanner;
public class SaleDiscount{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	double totalAmount = 0;
	for(int i = 1; i <= 3; i++){
		System.out.println("Enter quantity for item "+i+"");
	int quantity = sc.nextInt();
		System.out.println("Enter rate for item"+i+"");
	double rate = sc.nextDouble();
	
	totalAmount += quantity * rate;
	}
		System.out.println("totl sales amount "+totalAmount);

	double discount = 0;

	if(totalAmount > 1000){
		discount = 20.0 * totalAmount;
	}
	else if(totalAmount >= 500 && totalAmount <= 1000){
		discount = 15.0 * totalAmount;
	}
	else{
		System.out.println("Discount:"+discount);
		System.out.println("Amount to be paid after discount:"+(totalAmount - discount));
	}
    }
}
