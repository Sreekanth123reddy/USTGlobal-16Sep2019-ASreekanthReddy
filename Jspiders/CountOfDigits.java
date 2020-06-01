import java.util.Scanner;
class CountOfDigits
{
	public static void main(String aa[])
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number:");
	int num=scan.nextInt();
	int count=0;
	do
	{
	count++;
	num=num/10;
	}
	while(num!=0);
	System.out.println("The Count of digits  :" + count);

	}
}