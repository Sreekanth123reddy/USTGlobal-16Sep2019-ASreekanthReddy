public class TestB 
{
	static int b;
	int a;
	{
		 a = 20;
		 b = 30;
		 System.out.println("non-static block 1");
	}
	{
		System.out.println("non-static block 2");
	}
	public static void main(String[] args) {
		System.out.println("main-started");
		TestB obj = new TestB();
		TestB obj1 = new TestB();
		System.out.println("a Value is "+obj.a+"  b value is "+b);
		System.out.println("main -ended");
	}
}
