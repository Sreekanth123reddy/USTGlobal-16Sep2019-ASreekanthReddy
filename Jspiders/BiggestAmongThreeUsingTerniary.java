import java.util.Scanner;
class BiggestAmongThreeUsingTerniary
{
	public static void main(String aa[])
	{
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
	int b=in.nextInt();
	int c=in.nextInt();
	int big=(a>b&&a>c)?a:(b>c)?b:c;
	System.out.println(big+" is biggest number:");
	}
}