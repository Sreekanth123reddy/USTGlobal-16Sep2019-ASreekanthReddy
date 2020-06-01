import java.util.Scanner;
class MergeOf3Array
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
			System.out.println("enter the number of elements in 3rd array");
			int n2=sc.nextInt();
			int ar3[]=new int[n2];
			System.out.println("Enter "+n2+"values");
			for(int i=0;i<n2;i++)
			{
				ar3[i]=sc.nextInt();
			}
			
			int c[]=merge(ar1,ar2,ar3);
			System.out.print("Meregd array");
			for(int i=0;i<c.length;i++)
			{
			System.out.println(c[i]);
			}
	}
	static int[] merge(int a[],int b[],int a1[])
	{
			int c[]=new int[a.length+b.length+a1.length];
			for(int i=0;i<a.length;i++)
			{
				c[i]=a[i];
			}
			for(int i=0;i<b.length;i++)
			{
				c[a.length+i]=b[i];
			}
			for(int i=0;i<a1.length;i++)
			{
				c[a.length+b.length+i]=a1[i];
			}
			return c;
	}
}	