import java.util.Scanner;
class CountOfEvenAndOddArray
{
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number of elements");
			int n=sc.nextInt();
			int ar[]=new int[n];
			System.out.println("Enter "+n+"values");
			for(int i=0;i<n;i++)
			{
				ar[i]=sc.nextInt();
			}
			int count[]=countEO(ar);
			System.out.println("Number of even"+count[0]);
			System.out.println("Number of odd"+count[1]);

		}	

		static int[] countEO(int x[])
		{
			int ce=0,co=0; 	// int c[]={0,0}
			for(int i=0;i<x.length;i++)
			{
				if(x[i]%2==0)
					ce++;			//c[0]++  or // c[x[i]%2]]++;
				else
					co++;			//c[1]++
			}
			int c[]={ce,co};
			return c;			
		}

}