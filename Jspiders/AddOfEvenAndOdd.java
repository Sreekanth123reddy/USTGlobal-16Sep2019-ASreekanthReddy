import java.util.Scanner;
class AddOfEvenAndOdd
{
	public static void main(String aa[])
	{
	Scanner in=new Scanner(System.in);
	System.out.println("Enter a number :");
	int n=in.nextInt();
	int i=1,sumEven=0,sumOdd=0;
	while(i<=n)
	{
	if(i%2==0)
	sumEven=sumEven+i;
	else
	sumOdd=sumOdd+i;
	i++;
	}
	System.out.println("the sum of odd is :"+sumOdd+" the even number :"+sumEven);
	}
}