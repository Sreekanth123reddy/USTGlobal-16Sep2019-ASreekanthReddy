import java.util.Scanner;
class PositiveOrNegative
{
	public static void main(String aa[])
	{
	Scanner in =new Scanner(System.in);
	System.out.println("enter the number:");
	int n=in.nextInt();
	String str=(n>0)? "positive":"negative";
	System.out.println(n+"is"+str+"number");
	System.out.println("Thank you");
	}
}