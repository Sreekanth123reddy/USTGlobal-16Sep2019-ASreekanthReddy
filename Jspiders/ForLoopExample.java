import java.util.Scanner;
class ForLoopExample
{
	public static void main(String aa[])
	{
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();	
	for(int i=1;i<n;i=i+i) // i=2*i;
	{
	
	System.out.print(i+" ");
	}
	}
}