import java.util.Scanner;
class MultiplicationTable
{
	public static void main(String aa[])
	{
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the number :");
	int n=in.nextInt();
	for(int i=1;i<=10;i++)
	{
	System.out.println(n+"*"+i+"="+(n*i));
	}
	}
}   