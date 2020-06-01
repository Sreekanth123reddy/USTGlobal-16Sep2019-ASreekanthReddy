import java.util.Scanner;
import java.util.Random;
class GuessGame
{
	public static void main(String a[])
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("Guess number between 0 to 9:");
	int un=scan.nextInt();
	Random rd=new Random(); //Random is a class 
	int rn=rd.nextInt(10); //it will take numbers from 0 to 9
	if(un==rn)
	System.out.println("Guess is correct");
	else
	System.out.println("Guess is incorrect it was  :"+rn);
	}
}
