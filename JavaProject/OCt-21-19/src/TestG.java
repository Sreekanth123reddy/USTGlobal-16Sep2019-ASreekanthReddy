public class TestG 
{
	public static void main(String[] args) 
	{
		FirstGen g = new FirstGen();
		g.msg();
		g.call();
		System.out.println("****************************");
		SecondGen s = new SecondGen();
		s.call();
		s.msg();
		s.games();
		System.out.println("*****************************");
		ThirdGen f = new  ThirdGen();
		f.msg();
		f.call();
		f.games();
		f.camera();
	}
}
