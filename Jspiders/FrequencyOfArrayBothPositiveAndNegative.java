class FrequencyOfArrayBothPositiveAndNegative
{
	public static void main(String[] args) 
	{
		int a[]={23,45,28,45,-56,45,-56,39,-32,42,24,-78};
		printFrequency(a);
	}
	static void printFrequency(int a[])
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
					a[j]=n-1;
					n--;
					j--;
				}
			}
		System.out.println(a[i]+ "  Present  "+count+"  times");
		}

	}

}