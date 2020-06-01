import java.util.*;
class Pattern3
{
	public static void main(String[] args)
	 {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=1;i<=n;i++) //number of lines
		{
			for(int j=1;j<=n*2;j++) //no of elements in each line
			{
				System.out.print("*");
			}
			System.out.println();
		}
		

	}
}