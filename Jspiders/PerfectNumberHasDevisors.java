import java.util.Scanner;
class PerfectNumberHasDevisors
{
	public static void main(String a[])
	{
	Scanner in=new Scanner(System.in);
	System.out.println("Enter number to check perfect number:");
	int num=in.nextInt();
	int i=1,count=0;
	while(i<=num/2)
	{
	if(num%i==0)
		count++;
	i++;
	}
	System.out.println("the "+ num +" has "+  count +"devisors");
	
	}
}