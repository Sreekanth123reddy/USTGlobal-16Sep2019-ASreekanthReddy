import java.util.Scanner;
class SumOfEvenDigits
{
	public static void main(String aa[])
	{
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int sum=0;
	while(n>0)
	{
	int rem=n%10;
	if(rem%2==0)
	sum=sum+rem;
	n=n/10;
	}
	System.out.println("Sum of even digits:"+sum);
	}
}