class Reverse1
{
	public static void main(String[] args) {
		int x[]={28,32,45,3,78,19};
		int a[]=reverse(x);
		System.out.println("Reverse Array");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		

	}
static int[] reverse(int x[])
	{
		for(int i=0;i<x.length/2;i++)
		{
			int t=x[i];
			x[i]=x[x.length-1-i];
			x[x.length-1-i]=t;

		}
		return x;
	}

}