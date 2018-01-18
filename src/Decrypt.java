import javax.swing.JOptionPane;

public class Decrypt {
	String ps="";int l;
	public String drail(String s)
	{
		String dr=s,ts="";char c;int i,a;
		l=dr.length();
		int m=l/2;
		if(l%2==0);
		else
		m=m+1;
		for(i=0,a=m;i<m;i++,a++)
			{
				c=dr.charAt(i);
				ts=""+c;
				ps=ps.concat(ts);
				if(a<l)
				{
				c=dr.charAt(a);
				ts=""+c;
				ps=ps.concat(ts);
				}					
				
			}
		//System.out.println(ps);
		Dconvert dc=new Dconvert();
		String dcs=dc.dhexa(ps);
		//System.out.println(ps);
		return(dcs);
		
	}

}
