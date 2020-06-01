class DecimalToHexa
{
	public static void main(String[] args) {
			Hexa h=new Hexa();
			System.out.println(h.dectoHex(156));
			}	
}
class Hexa
{
	String dectoHex(int dec)
	{
		String hx="";
		do
		{
			int r=dec%16;
			if(r<10)
				hx=r+hx;
			else
			{
				switch(r)
				{
					case 10: hx='A'+hx;
							 break;
					case 11: hx='B'+hx;
							 break;
					case 12: hx='C'+hx;
							 break;
					case 13: hx='D'+hx;
							 break;
					case 14: hx='E'+hx;
							 break;
					case 15: hx='F'+hx;
							 break;
				
				}
			}
			dec=dec/16;
		}while(dec!=0);
		return hx;
	}

}