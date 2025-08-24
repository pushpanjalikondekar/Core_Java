import java.util.Scanner;

public class Profit_Loss_cal{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Cost Price:");
	double costPrice = sc.nextDouble();

	System.out.println("Enter Sellin Price:");
	double sellingPrice = sc.nextDouble();

	if(sellingPrice > costPrice){
	double profit = sellingPrice - costPrice;
	}

	else if(sellingPrice < costPrice){
	double loss = costPrice - sellingPrice;
	System.out.println("The Loss is:"+loss);
	}

	else{
		System.out.println("No profit,No loss");
	}
     }
}


