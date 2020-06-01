class UnionArray
{
	public static void main(String[] args) {
		int x[]={23,45,56,78,89,35};
		int y[]={42,56,32,45,89};
		int res[]=unMethod(x,y);
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+" ");
		}
}
static int[] unMethod(int a[],int b[])
	{
		int c[]=new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		int k=a.length;
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
			{
				c[k++]=b[i];
			}

		}
	int n[]=new int[k];
	for(int i=0;i<k;i++)
	{
		n[i]=c[i];
	}
	return n;
	}
}