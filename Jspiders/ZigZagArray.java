import java.util.Scanner;
class ZigZagArray
{
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number of elements in 1st array");
			int n=sc.nextInt();
			int ar1[]=new int[n];
			System.out.println("Enter "+n+"values");
			for(int i=0;i<n;i++)
			{
				ar1[i]=sc.nextInt();
			}
			System.out.println("enter the number of elements in 2nd array");
			int n1=sc.nextInt();
			int ar2[]=new int[n1];
			System.out.println("Enter "+n1+"values");
			for(int i=0;i<n1;i++)
			{
				ar2[i]=sc.nextInt();
			}
			int res[]=zigzag(ar1,ar2);
			for(int i=0;i<res.length;i++)
			{
				System.out.print(res[i]);
			}
		}
	static int[] zigzag(int a[],int b[])
	{
		int c[]=new int[a.length+b.length];
		int i=0,j=0,k=0;
		while(i<a.length&&j<b.length)
		{
			if(k%2==0)
				c[k++]=a[i++];
			else
				c[k++]=b[j++];
		}
		while(i<a.length)
				{
					c[k++]=a[i++];
				}
				while(j<b.length)
				{
					c[k++]=b[j++];
				}
		return c;
	}
}
