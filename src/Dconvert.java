
public class Dconvert {
	String hps="";
	public String dhexa(String s)
	{
		String hs=s;char hc;
		int l=hs.length();
		for(int i=0;i<l;i++)
		{
			 hc=hs.charAt(i);
			switch(hc)
			{
				case '0':hps=hps.concat("0000");break;
				case '1':hps=hps.concat("0001");break;
				case '2':hps=hps.concat("0010");break;
				case '3':hps=hps.concat("0011");break;
				case '4':hps=hps.concat("0100");break;
				case '5':hps=hps.concat("0101");break;
				case '6':hps=hps.concat("0110");break;
				case '7':hps=hps.concat("0111");break;
				case '8':hps=hps.concat("1000");break;
				case '9':hps=hps.concat("1001");break;
				case 'A':hps=hps.concat("1010");break;
				case 'B':hps=hps.concat("1011");break;
				case 'C':hps=hps.concat("1100");break;
				case 'D':hps=hps.concat("1101");break;
				case 'E':hps=hps.concat("1110");break;
				case 'F':hps=hps.concat("1111");break;
			}
		}
		//System.out.println(hps);
		return(hps);
	}

}
