 import java.util.Scanner;
class ArmstrongNumber
{
	public static void main(String aa[])
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number:");
	int num=scan.nextInt();
	int sum=0,t=num;
	do
	{
	int rem=num%10;
	sum=sum+rem*rem*rem;
	num=num/10;
	}
	while(num!=0);
	if(sum==t)
	System.out.println("entered number is armstrong");
	else
	System.out.println("entered number is not armstrong");
	}
}