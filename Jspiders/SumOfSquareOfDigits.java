import java.util.Scanner;
class SumOfSquareOfDigits
{
	public static void main(String aa[])
	{
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int sum=0;
	while(n>0)
	{
	int rem=n%10;
	sum=sum+rem*rem;
	n=n/10;
	}
	System.out.println("Sum of square of digits:"+sum);
	}
}