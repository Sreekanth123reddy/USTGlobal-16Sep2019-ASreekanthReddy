import java.util.Scanner;
class EvenAndOddElementInMatrix
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
		int el[]=mt.getResult(ar);
		System.out.println("EvenCount :"+el[0]);
		System.out.println("OddCount :"+el[1]);
	}	
}
class Matrix
{
	int[] getResult(int m[][])
	{
		int ec=0,oc=0;
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m[i].length;j++)
			{
				if(m[i][j]%2==0)
					ec++;
				else 
					oc++;
			}
		}
		int c[]={ec,oc};
		return c;
	}
}