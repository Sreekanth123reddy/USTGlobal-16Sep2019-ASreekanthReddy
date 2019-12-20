public class Test 
{
	public static void main(String[] args) 
	{
		Pen p = new Pen();
		p.cost = 100;
		p.color = "black";
		p.brand = "cello";
		System.out.println("Cost is "+p.cost+"  color is "+p.color +"  brand is "+p.brand);
		p.write();
		System.out.println("=================================");
		Van v = new Van();
		v.cost = 500000;
		v.color = "white";
		System.out.println("Van cost is "+v.cost +"color is  "+ v.color);
		v.move();
	}
}
