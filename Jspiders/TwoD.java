//WJP to read and display the two dimensional arrayy elements from the user
import java.util.Scanner;
class TwoD
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of rows and columns");
		int r=in.nextInt();
		int c=in.nextInt();
		int ar[][]=new int[r][c];
		System.out.println("enter"+r*c+"elements");
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				ar[i][j]=in.nextInt();
			}
		}
		System.out.println("enter matrix elements");
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				System.out.print("   "+ar[i][j]);
			}
			System.out.println();
		}

	}	
}