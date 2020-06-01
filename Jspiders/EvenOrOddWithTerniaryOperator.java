import java.util.Scanner;
class EvenOrOddWithTerniaryOperator
{
	public static void main(String aa[])
	{
	Scanner in =new Scanner(System.in);
	System.out.println("enter the number:");
	int n=in.nextInt();
	String str=(n%2==0)? "even":"odd";
	System.out.println(n+"is"+str+"number");
	System.out.println("Thank you");
	}
}