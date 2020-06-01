class FrequencyOfArray
{
	public static void main(String[] args) 
	{
		int a[]={23,45,28,45,56,45,28,39,32,42};
		printFrequency(a);
	}
	static void printFrequency(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=-1)
			{
				int count=1;	
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						count++;
						a[j]=-1;
					}
				}

				System.out.println(a[i]+ " present "+count+"  times");
			}
		}
	}

}