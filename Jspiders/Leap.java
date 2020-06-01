import java.util.Scanner;
class Leap
{
	public static void main(String aa[])
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the last year:");
	int n=scan.nextInt();
		
	System.out.println("no of years:"+ (n/4-n/100+n/400));
	

	}
}