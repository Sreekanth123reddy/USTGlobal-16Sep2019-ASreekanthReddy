import java.util.Scanner;
class SumOfDigits
{
	public static void main(String aa[])
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number:");
	int num=scan.nextInt();
	int sum=0;
	do
	{
	int rem=num%10;
	sum=sum+rem;
	num=num/10;
	}
	while(num!=0);
	System.out.println("The sum of digits  :" +  sum);

	}
}