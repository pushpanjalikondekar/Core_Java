import java.util.Scanner;

public class TriangleValidity{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the Three sides of triangle:");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();

	if(a + b > c && a + c > b && b + c > a){
		System.out.println("The Triangle is Valid:");
	}

	else{
		System.out.println("The Triangle is  Not Valid:");
	}
    }
}
