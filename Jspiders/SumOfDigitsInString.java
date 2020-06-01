  //WJP to calculate sum of digits from the string ?
  import java.util.Scanner;
  class SumOfDigitsInString
  {
  		public static void main(String[] args) {
  		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the sentence ");
		String str=scan.nextLine();
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
		char ch=str.charAt(i);

		if(ch>='0'&&ch<='9')
		{
			sum=sum+ch-48;
		}
		}
		System.out.println("the sum is :"+sum);
		
  		}
  }