class PoolPuzzle
{
	public static void main(String aa[])
	{
	int x =0;
	while(x>0)
	{
	System.out.print("a");
	if(x<1)
	{
	System.out.print(" " );
	}
	x = x+2;
	if(x<4)
	{
	System.out.print("noise");
	x = x-1;
	}
	if(x==1)
	{
	System.out.print("annoys");
	}
	
	}
}