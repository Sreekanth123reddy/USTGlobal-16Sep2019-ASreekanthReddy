import java.util.Scanner;
class ProductOfDigits
{
	public static void main(String aa[])
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number:");
	int num=scan.nextInt();
	int product=1 ;
	do
	{
	int rem=num%10;
	product=product*rem;
	num=num/10;
	}
	while(num!=0);
	System.out.println("The Product  of digits  :" +product);

	}
}