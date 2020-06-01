import java.util.Scanner;
class Pattern31
{
	public static void main(String aa[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==n/2||j==n/2||i==j||i+j==n-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}