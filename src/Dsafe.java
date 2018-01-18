
public class Dsafe {
	String hps="";
	public void desafe(String s,String k)
	{
	String ds=s,dk=k,dd="",da="";
	char ia,ib;
	int c,d,l;
	int a=ds.length();
	int b=dk.length();
	if(a<=b)
	{
	if(a<b)
	{
	 dd=dk.substring(0,a);
	 b=dk.length();
	 //System.out.println("first "+b);	
	}
	else
	dd=dk;
	}
	else
	{
	 c=a/b;
	 d=a%b;
	 da=dk.substring(0,d);
	 l=da.length();
	 //System.out.println("da "+l);
	for(int i=0;i<c;i++)
	{
		dd=dd.concat(dk);
	}
	dd=dd.concat(da);
	b=dd.length();
	//System.out.println("second "+b);
	 //System.out.println("seconda "+a);
	}
	for(int i=0;i<a;i++)
	{
		//System.out.println("seconda enter");
		ia=ds.charAt(i);
		ib=dd.charAt(i);
		//System.out.println("seconda enter2");
		if(ia==ib)
		{
		hps=hps.concat("0");
		}
		else
		{
		hps=hps.concat("1");
		}
		//System.out.println("seconda enter3");
	}
	}

	public void dbinary()
	{
	String bmw,hc="",bps="";
		int l=hps.length();
		for(int i=0;i<l;i+=2)
		{
			 hc=hps.substring(i,i+2);
			//System.out.println(hc);
			switch(hc)
			{
				case "01":bps=bps.concat(".");break;
				case "10":bps=bps.concat("-");break;
				case "11":bps=bps.concat(" ");break;
			}
		}
		//System.out.println(bps);
			Dmorse dm=new Dmorse();
			dm.doutput(bps);
	}
}
