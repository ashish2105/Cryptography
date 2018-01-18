import javax.swing.JOptionPane;

public class Safe {
	int v[],a;
	public void Bsafe(String s,String k)
		{
		String ss=s,sk=k,sa="",ska="";
		char ia,ib;
		int c,d,l;
		a=ss.length();
		if(a%4==0);
		else
		ss=ss.concat("00");
		a=ss.length();
		int b=sk.length();
		//System.out.println(a);
		//System.out.println(b);
		if(a<=b)
		{
		if(a<b)
		{
		 ska=sk.substring(0,a);
		 b=sk.length();
		 //System.out.println("first "+b);	
		}
		else
		ska=sk;
		}
		else
		{
		 c=a/b;
		 d=a%b;
		 sa=sk.substring(0,d);
		 l=sa.length();
		 //System.out.println("sa "+l);
		for(int i=0;i<c;i++)
		{
			ska=ska.concat(sk);
		}
		b=sk.length();
		 //System.out.println("second "+b);
		ska=ska.concat(sa);
		}
		v=new int[a];	
		for(int i=0;i<a;i++)
		{
			ia=ss.charAt(i);
			ib=ska.charAt(i);
			if(ia==ib)
				v[i]=0;
			else
				v[i]=1;
			//System.out.println(v[i]);
		}
		}

	public void hexa()
	{
		
		String hs="",t;

		for(int i=0;i<a;i+=4)
		{
			int sum=(v[i]*8+v[i+1]*4+v[i+2]*2+v[i+3]*1);
			t=""+sum;
			switch(sum)
			{
				case 10:hs=hs.concat("A");break;
				case 11:hs=hs.concat("B");break;
				case 12:hs=hs.concat("C");break;
				case 13:hs=hs.concat("D");break;
				case 14:hs=hs.concat("E");break;
				case 15:hs=hs.concat("F");break;
				default:hs=hs.concat(t);break;
			}	
		}
		//System.out.println(hs);
		Enrypt en=new Enrypt();
		en.rail(hs);
		//JOptionPane.showMessageDialog(null, "The Encrypted Text is"+hs);
		//return(hs);	
	}
}
