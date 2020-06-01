class AreaOfCircle
{
	 public static void main(String[] args) //calling method
	  {
	 	double r1=6.7,r2=8.9,r3=3.6,r4=14;
	 	Circle cir=new Circle();
	 	cir.Area(r1); //calling statement
	 	cir.Area(r2);
	 	cir.Area(r3);
	 	cir.Area(r4);
		
	}
}
class Circle
{
	void Area(double r) //Calling method
	{
		double a=3.14*r*r;
		System.out.println(r +": Area Of Circle"+a);
		double b=2*3.14*r;
		System.out.println(r +": Circumference of Circle"+b);
	}
}