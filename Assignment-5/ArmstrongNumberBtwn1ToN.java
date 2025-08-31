import java.util.Scanner;

public class  ArmstrongNumber1_To_N{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a value of N: ");
		int k = sc.nextInt();
		
		
		System.out.println("Armstrong Number Between 1 to "+k+"are : ");
		for(int n=1 ; n<k ; n++){
			int cnt = 0 ;
			double arm = 0;
			int temp = n;
			while(temp>0){
				cnt++;
				temp/=10;
			}
			temp = n;
			while(temp>0){
				int rem = temp % 10;
				arm += Math.pow(rem,cnt);	
				temp /= 10;
			}
			if(arm == n)
				System.out.println(n+" ");
		}
	}
}