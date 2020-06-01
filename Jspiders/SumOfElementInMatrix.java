import java.util.Scanner;
class SumOfElementInMatrix
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
		int el=mt.getSum(ar);
		System.out.println("Biggest element ->"+el);
	}	
}
class Matrix
{
	int getSum(int m[][])
	{
		int sum=0;
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m[i].length;j++)
			{
				sum=sum+m[i][j];
			}
		}
		return sum;
	}
}