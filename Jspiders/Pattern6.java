import java.util.*;
class Pattern6
{
	public static void main(String[] args)
	 {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)									// A B C D E
			{
				System.out.print((char)(j+64)+" ");					// A B C D E
				
			}
			System.out.println();
		}

	}
}