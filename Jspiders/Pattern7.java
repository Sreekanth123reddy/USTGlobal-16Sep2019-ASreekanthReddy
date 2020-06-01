import java.util.*;
class Pattern7
{
	public static void main(String[] args)
	 {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)									// A A A A A
			{
				System.out.print((char)(i+64)+" ");					// B B B B B
				
			}														// C C C C C
			System.out.println();
		}

	}
}