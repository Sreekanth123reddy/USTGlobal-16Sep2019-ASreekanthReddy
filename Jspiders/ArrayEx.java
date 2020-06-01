class ArrayEx
{
	public static void main(String[] args) {
			byte mark[];
			mark=new byte[4];
			mark[0]=67;
			mark[1]=98;
			mark[2]=45;
			mark[3]=34;
			int sum=0;
			for(int i=0;i<mark.length;i++)
			{
				sum=sum+mark[i];
			}
			System.out.println(sum);
		}	
}