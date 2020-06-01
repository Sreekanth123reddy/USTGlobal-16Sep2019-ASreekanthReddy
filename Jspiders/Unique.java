class Unique
{
	public static void main(String[] args) 
	{
		int a[]={23,45,28,45,-56,45,-56,39,-32,42,24,-78};
		int res[]=printFrequency(a);
		for(int i=0;i<res.length;i++)
		{
			System.out.print("   "+res[i]);
		}
	}
	static int[] printFrequency(int a[])
	{
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			int count=1;
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					a[j]=a[n-1];
					n--;
					j--;
				}
		
		}	
	}
		int na[]=new int[n];
		{
			for(int i=0;i<n;i++)
			{
				na[i]=a[i];
			}
			return na;
		}
		

	}

}