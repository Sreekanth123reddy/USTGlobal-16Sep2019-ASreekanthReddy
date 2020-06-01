import java.util.Scanner;
class SortedTwoArrayIntoSingleSortedArray
{
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number of elements in 1st array");
			int n=sc.nextInt();
			int ar1[]=new int[n];
			System.out.println("Enter "+n+"values in Ascending order");
			for(int i=0;i<n;i++)
			{
				ar1[i]=sc.nextInt();
			}
			System.out.println("enter the number of elements in 2nd array");
			int n1=sc.nextInt();
			int ar2[]=new int[n1];
			System.out.println("Enter "+n1+"values Ascending order");
			for(int i=0;i<n1;i++)
			{
				ar2[i]=sc.nextInt();
			}
			
			int c[]=mergeSort(ar1,ar2);
			System.out.print("Meregd Sorted array");
			for(int i=0;i<c.length;i++)
			{
			System.out.println(c[i]);
			}
			}

			static int[] mergeSort(int a[],int b[])
			{
				int z[]=new int[a.length+b.length];
				int i=0,j=0,k=0;
				while(i<a.length&&j<b.length)
				{
					if(a[i]<b[j])
						z[k++]=a[i++];
					else
						z[k++]=b[j++];
				}
				while(i<a.length)
				{
					z[k++]=a[i++];
				}
				while(j<b.length)
				{
					z[k++]=b[j++];
				}
				return z;
			}
}