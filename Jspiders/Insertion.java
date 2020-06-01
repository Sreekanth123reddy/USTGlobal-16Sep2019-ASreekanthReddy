class Insertion
{
	public static void main(String[] args) {
		int x[]={28,32,45,3,78,19};

		int a[]=insert(x,46,2);
		System.out.println("New Modified array");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}
static int[] insert(int x[],int ele,int index)
	{
		if(index<0||index>x.length)
		{
			System.out.println("Not possible to insert");
		return x;
		}
	
			int y[]=new int[x.length+1];
			x[index]=ele;
			for(int i=0;i<x.length;i++)
			{
				if(i<index)
					y[i]=x[i];
				else
					y[i+1]=x[i];
			} 
		return y;
	}

}