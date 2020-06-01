import java.util.Scanner;
class Numberby5and7
{
	public static void main(String aa[])
	{
	Scanner in=new Scanner(System.in);
	System.out.println("Enter number:");
	int n=in.nextInt();
	int count=0,i=1;
	while(i<=n)
	{
	if(i%5==0 && i%7==0)
	count++;
	i++;	
	}
	System.out.println("The 5 and 7 of divisors has"+count);
	}
}