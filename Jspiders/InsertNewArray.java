class InsertNewArray
{
	public static void main(String[] args) {
		int x[]={28,32,45,3,78,19};
		int y[]={3,5,91};

		int a[]=insert(x,y,1);
		System.out.println("New Modified array");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}
static int[] insert(int x[],int y[],int in)
	{
		if(in<0||in>=x.length)
		{
			System.out.println("Not possible to insert");
			return x;
		}
	
			int z[]=new int[x.length+y.length];

			for(int i=0;i<y.length;i++)
			{
				z[in+i]=y[i];
			}
			for(int i=0;i<x.length;i++)
			{
				if(i<in)
					z[i]=x[i];
				else
					z[i+y.length]=x[i];
			}
			return z;
}
}