import java.util.Scanner;
class EvenOrOddSwitchcase
{
	public static void main(String aa[])
	{
	Scanner in=new Scanner(System.in);
	System.out.println("Enter a number:");
	int n=in.nextInt();
	switch(n%2)
	{
		case 1:System.out.println(n + " is odd number");
			break;
		case 0:System.out.println(n + " is even number");
			break;
	}

	}
}