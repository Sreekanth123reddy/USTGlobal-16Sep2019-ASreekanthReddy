import java.util.Scanner;
class NumberToSentence
{
	static void ntoWord(int n,String str)
	{
	String one[]={"","one","two","three","four","Five","Six","seven","eight","eleven","twelve","Thirteen","Fouteen","Fifteen","sixteen","seventeen","eighteen","nineteen"};
	String two[]={"","","twenty","thirty","fourtey","fifty","sixty","seventy","eighty","ninety"};
	if(n<20)
		System.out.print(one[n]);
	else
		System.out.print(two[n/10]+one[n%10]);
	if(n!=0)
		System.out.print(str+" ");
	}

	public static void main(String[] args)
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Number : ");
	int no=scan.nextInt();
	ntoWord(no/10000000," crore");
	ntoWord(no/100000%100," Lakh");
	ntoWord(no/1000%100," thousand");
	ntoWord(no/100%10,"hundread");
	ntoWord(no%100,"");
	}
}