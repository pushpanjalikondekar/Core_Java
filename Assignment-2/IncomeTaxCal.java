import java.util.Scanner;

public class IncomeTaxCal{
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);

	System.out.println("Enter Annual basic Salary:");
	double salary = sc.nextDouble();

	double tax;
	
	if(salary < 150000){
		tax = 0;
	}
	else if(salary <= 300000){
		tax = 20.0 * salary;
	}
	else{
		tax = 30.0 * salary;
	}

	System.out.println("Annual Salary:" +salary);
	System.out.println("Income Tax:" +tax);
    }
}