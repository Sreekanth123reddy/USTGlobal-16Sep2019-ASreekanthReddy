class CountDistinctArray
{
	public static void main(String[] args) {
		int x[]={23,45,56,78,89,35};
		int y[]={42,56,32,45,89};
		int res=distinct(x,y);
		
			System.out.print(res+" ");
		
}
static int distinct(int a[],int b[])
	{
int count=0;
	for(int i=0;i<a.length;i++)
	{
		boolean rs=true;
		for(int j=0;j<b.length;j++)
		{
			if(a[i]==b[j])
			{
				rs=false;
				break;
			}
		}
		if(rs)
			count++;
	}
	for(int i=0;i<b.length;i++)
	{
		boolean rs=true;
		for(int j=0;j<a.length;j++)
		{
			if(b[i]==a[j])
			{
				rs=false;
				break;
			}
		}
		if(rs)
			count++;
	}
	return count;
	}
}