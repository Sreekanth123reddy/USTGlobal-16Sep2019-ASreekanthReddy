import java.util.Scanner;
class PrimeNumberArray
{
	public static void main(String[] args) {
		int a[]=readArray();
		int res=prime(a);
		System.out.println(res);
		
	}

	static int[] readArray()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=in.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter"+ n+" values");
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter"+(i+1)+"value");
			ar[i]=in.nextInt();
		}
			return ar;		
}
	
static int prime(int n[])
	{
		int count=1,i=1,c=0;
		for(int j=0;j<n.length;j++)
		{
		while(i<=n[j]/2)
		{
			if(n[j]%i==0)
				count++;
				i++;
		}
		
		if(count==2)
		 c++;
		}
		return c;
	}	
}