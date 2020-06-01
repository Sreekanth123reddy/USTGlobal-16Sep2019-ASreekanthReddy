class MinusArray   
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
		int find=1;
		for(int j=0;j<b.length;j++)
		{
			if(a[i]==b[j])
				{
				find=0;
				break;
			}
		}
		if(find==1)
			c[k++]=a[i];
	}
	int newArray[] =new int[k];
	for(int i=0;i<k;i++)
	
		newArray[i]=c[i];
	
	return newArray;
}
}