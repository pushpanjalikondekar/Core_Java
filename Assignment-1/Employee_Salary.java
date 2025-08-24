import java.util.Scanner;

public class Employee_Salary{
	public static void main(String[] args){
	
	int id;
	double da = 30.0, hra = 10.0, tax = 5.0, basicSalary, totalSalary, takeHome;

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter ID :");
	id = sc.nextInt();
	System.out.println("Enter Basic Salary:");
	basicSalary = sc.nextDouble();

	totalSalary = basicSalary + ((basicSalary*(da+hra))/100);
	takeHome = totalSalary -(totalSalary * tax)/100;

	
	
	System.out.println("Take Home Salary of Employee : "+takeHome);

	}
}


	