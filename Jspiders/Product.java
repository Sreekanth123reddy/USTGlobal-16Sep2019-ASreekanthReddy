import java.util.Scanner;
class Product
{
	public static void main(String aa[])
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("The Product name is:");
	String proName=scan.nextLine();
	System.out.println("The price of "+proName);
	int price=scan.nextInt();
	System.out.println("what amount you have:");
	int money=scan.nextInt();
	int youCan=money/price;
	int still=money-youCan*price; // money%price
	System.out.println(proName+" products you can buy are :"+youCan+" : Still you have "+still+" rupess");
	f }
}