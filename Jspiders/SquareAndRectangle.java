import java.util.*;
class SquareAndRectangle
{
	 public static void main(String[] args) {
	 	Shape obj=new Shape();
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter the side of a Square");
		double s=Scan.nextDouble();
		obj.printSquare(s);
		System.out.println("Enter the length and bredth of rectangle");
		double l=Scan.nextDouble();
		double b=Scan.nextDouble();
		obj.printRectangle(l,b);
	}
}
class Shape
{
	void printSquare(double side)
	{
		double area=side*side;
		double per=4*side;
		System.out.println("Area of Square :"+area + " "+"Perimeter of a square :"+per);
	}

	void printRectangle(double length, double bredth)
	{
		double area=length*bredth;
		double per=2*(length+bredth);
		System.out.println("Area of rectangle :"+area+" "+"Perimeter of rectangle :"+per);
	}
}