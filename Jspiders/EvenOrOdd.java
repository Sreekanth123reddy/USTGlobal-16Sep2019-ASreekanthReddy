import java.util.Scanner;
class EvenOrOdd
{
	public static void main(String aa[])
	{
	Scanner in =new Scanner(System.in);
	System.out.println("enter the number:");
	int n=in.nextInt();
	if(n%2==0)
	System.out.println(n+"is even number");
	else
	System.out.println(n+"is odd number");
	System.out.println("Thank you");
	}
}