import java.util.Scanner;
class PrimenumberVerify
{
	public static void main(String a[])
	{
	Scanner in=new Scanner(System.in);
	System.out.println("Enter number to check perfect number:");
	int num=in.nextInt();
	int i=1,count=1;
	while(i<=num/2)
	{
	if(num%i==0)
		count++;
		if(count>2)
		break;
	i++;
	}
	if(count==2)
	System.out.println("the number is prime");
	else
	System.out.println("The number is not prime");
	
	}
}