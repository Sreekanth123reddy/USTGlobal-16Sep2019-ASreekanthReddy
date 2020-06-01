class IntersectionArray   
{
	public static void main(String[] args) {
		int x[]={23,45,56,78,89,35};
		int y[]={42,56,32,45,89};
		int res[]=intersect(x,y);
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+" ");
		}
}
static int[] intersect(int a[],int b[])
{
	int k=0;
	int c[]=new int[a.length];
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<b.length;j++)
		{
			if(a[i]==b[j])
					{
				c[k++]=a[i];
				break;
					}
			
		}
	}
	int newArray[] =new int[k];
	for(int i=0;i<k;i++)
	
		newArray[i]=c[i];
	
	return newArray;
}
}