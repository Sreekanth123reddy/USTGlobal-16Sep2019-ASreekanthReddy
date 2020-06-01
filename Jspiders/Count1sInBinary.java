class Count1sInBinary
{
	public static void main(String[] args) {
		BinaryCount bc=new BinaryCount();
		System.out.println(bc.countSettedBits(3));
	}
}
class BinaryCount
{
	int countSettedBits(int n)
	{
		int count=0;
		do
		{
			if(n%2==1)
				count++;
			n=n/2;
		}while(n!=0);
		return count;
	}
}