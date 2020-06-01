import java.util.Scanner;
class PositiveAndNegativeInArray
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=in.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter"+(i+1)+"value");
			ar[i]=in.nextInt();
		}
		 int c[]=posNeg(ar);
		 System.out.println("positive numbers"+c[0]);
		 System.out.println("Negative numbers"+c[1]);
		
	}
	static int[] posNeg(int a[])
	{
		int pc=0,nc=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
				pc++;
			else
				nc++;
		}
		int c[]={pc,nc};
		return c;
	}
}
