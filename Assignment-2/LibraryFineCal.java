import java.util.Scanner;

public class LibraryFineCal{
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the number of days the book is late:");

	int days = sc.nextInt();

	int finePerDay;

	if(days < 5){
		finePerDay = 2;
	}
	else if(days <= 10){
		finePerDay = 3;
	}
	else{
		finePerDay = 5;
	}

	int totalFine = days * finePerDay;

	System.out.println("Days late:"+days);
	System.out.println("Fine Per Day:"+finePerDay);
	System.out.println("Total Fine :"+totalFine);
    }
}