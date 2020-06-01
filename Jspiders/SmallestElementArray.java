import java.util.Scanner;
class SmallestElementArray
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
		int res=smallMethod(ar);
		
		System.out.println(res);
		
	}

		static int smallMethod(int  a[])
		{
		int small=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<small)
				small=a[i];
		}	
			return small;
		}
		

}