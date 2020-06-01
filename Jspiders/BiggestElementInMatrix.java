//Define a method to return biggest element from the matrix
//WJP to read and display the two dimensional arrayy elements from the user
import java.util.Scanner;
class BiggestElementInMatrix
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
		Matrix mt=new Matrix();
		int el=mt.getBiggest(ar);
		System.out.println("Biggest element ->"+el);
	}	
}
class Matrix
{
	int getBiggest(int m[][])
	{
		int big=m[0][0];
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m[i].length;j++)
			{
				if(m[i][j]>big)
					big=m[i][j];
			}
		}
		return big;
	}
}