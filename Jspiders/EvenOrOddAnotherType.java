import java.util.Scanner;
class EvenOrOddAnotherType
{
	public static void main(String aa[])
	{
	Scanner in =new Scanner(System.in);
	System.out.println("enter the number:");
	int n=in.nextInt();
	if(n/2*2==n)
	System.out.println(n+"is even number");
	else
	System.out.println(n+"is odd number");
	System.out.println("Thank you");
	}
}