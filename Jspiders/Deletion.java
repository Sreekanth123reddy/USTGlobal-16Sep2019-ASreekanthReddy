class Deletion
{
	public static void main(String[] args) {
		int x[]={28,32,45,3,78,19};

		int a[]=delete(x,2);
		System.out.println("New Modified array");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}
static int[] delete(int x[],int index)
	{
		if(index<0||index>=x.length)
		{
			System.out.println("Not possible to insert");
		return x;
		}
	
			int y[]=new int[x.length-1];
			
			for(int i=0;i<x.length-1;i++)
			{
				if(i<index)
					y[i]=x[i];
				else
					y[i]=x[i+1];
			} 
		return y;
	}

}