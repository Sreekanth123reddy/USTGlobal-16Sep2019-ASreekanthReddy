import java.util.Scanner;
class BiggestOfArray
{
			public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number of elements");
			int n=sc.nextInt();
			int ar[]=new int[n];
			System.out.println("Enter "+n+"values");
			for(int i=0;i<=n;i++)
			{
				
				ar[i]=sc.nextInt();
			}
			int big=getBiggest(ar);
	System.out.println("bigest element:"+big);
		}	
	static int getBiggest(int a[])
	{

		int big=a[0];
		int i;
		for( i=0;i<a.length;i++);
		{
			if(a[i]>big)
				big=a[i];
		}
			return big;
		}
	

}