import java.util.Scanner;
class EvenOrOddWithStringArray
{
	public static void main(String aa[])
	{
	Scanner in =new Scanner(System.in);
	System.out.println("enter the number:");
	int n=in.nextInt();
	String str[]={"Even","odd"};
	System.out.println(n+"is"+str[n%2]+"number");
	System.out.println("Thank you");
	}
}