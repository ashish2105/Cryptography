
public class Convert {
	int a[],n,m,v,p;
	public String binary(String ms)
	{
		
		String bc=ms,s,ks="";
		char c;
		//System.out.println(bc);
		n=bc.length();
		m=2*n;
		//System.out.println(n+"and"+m);
		a=new int[m];
		for(int i=0;i<n;i++)
		{
			c=bc.charAt(i);
			switch(c)
                	{
				case '.':a[2*i]=0;a[2*i+1]=1;break;
				case '-':a[2*i]=1;a[2*i+1]=0;break;
				case ' ':a[2*i]=1;a[2*i+1]=1;break;
			}
			
			//System.out.println(a[2*i]);
			//System.out.println(a[2*i+1]);
			s=""+a[2*i];
			ks=ks+s;
			s=""+a[2*i+1];
			ks=ks+s;
		}
		return(ks);
	}

}
