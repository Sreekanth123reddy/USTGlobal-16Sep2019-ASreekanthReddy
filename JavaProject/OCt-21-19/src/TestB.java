public class TestB 
{
	public static void main(String[] args) 
	{
		Cow c  = new Cow();
		c.name ="Lakshmi";
		c.color="white";
		System.out.println("cow name "+c.name+"cow color"+c.color);
		c.eat();
		c.sleep();
		System.out.println("***************************");
		Cow c1  = new Cow();
		c1.name ="Ganga";
		c1.color="white";
		System.out.println("cow name "+c1.name+" color"+c1.color);
		c1.eat();
		c1.sleep();
		
		
	}
}
