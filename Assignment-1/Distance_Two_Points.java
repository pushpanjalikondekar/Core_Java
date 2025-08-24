import java.util.Scanner;
public class Distance_Two_Points{
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	float  x1, y1, x2, y2;
	double distance;

	System.out.println("Enter the x1 and y1 coordinates :");
	x1 = sc.nextFloat();
	y1 = sc.nextFloat();

	Syatem.out.println("Enter the x2 and y2 coordinates :");
	x2 = sc.nextFloat();
	y2 = sc.nextFloat();

	distance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2=y1));

	System.out.println("Distance between the two Points:"+distance);

	}
}