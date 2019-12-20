public class TestA 
{
	static int a;
	int b;
	static
	{
		a = 10;
		System.out.println("static block 1");
	}
	TestA()
	{
		System.out.println("TestA() constructor");
	}
	static
	{
		a =20;
		System.out.println("static block 2");
	}
	static
	{
		a = 40;
		System.out.println("static block 3");
	}
	public static void main(String[] args) {
		TestA o = new TestA();
		TestA o1 = new TestA();
		System.out.println("a value is"+a);
	}
}
