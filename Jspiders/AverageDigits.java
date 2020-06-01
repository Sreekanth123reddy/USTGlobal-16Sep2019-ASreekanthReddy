import java.util.Scanner;
class AverageDigits
{
	public static void main(String aa[])
	{
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int sum=0,count=0;
	do
	{
	int rem=n%10;
	sum=sum+rem;
	n=n/10;
	count++;
	}while(n>0);
	
	int avg=sum/count;
	System.out.println("Average is:"+avg);
	
	}
}