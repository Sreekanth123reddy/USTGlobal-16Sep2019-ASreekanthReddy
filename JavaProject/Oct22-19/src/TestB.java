public class TestB 
{
	static int a =25;
	int x;
	static TestB t;
	public static void add()
	{
		final int b = 20;
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) 
	{
		add();
	TestB t= new  TestB();
	System.out.println("x value :"+t.x);
	}
}
