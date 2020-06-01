class PairArray
{
	public static void main(String[] args) {
		int x[]={2,7,6,5,4,8,9,3};
		printPair(x,10);
}
static void printPair(int a[],int n)
{
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]+a[j]==n)
				System.out.println(a[i]+" "+a[j]);
		}
	}
}
}