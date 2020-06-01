class Fibbonacci
{
	public static void main(String[] args) {
		Fibb f=new Fibb();
		f.fib(30);
		
	}
}
class Fibb
{
	void fib(int n)
	{
		int f1=0,f2=1;
		while(n>0)
		{
			System.out.print(f1+" ");
			int f3=f1+f2;
			f1=f2;
			f2=f3;
			n--;
		}
	}
}