import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

import javax.swing.JOptionPane;

public class Enrypt {
	public void rail(String s)
	{
		char c;
		String fs="",q,es=s;
		int lp=es.length(); 
		for(int i=0;i<lp;i+=2)
		{
			c=es.charAt(i);
			q=""+c;
			fs=fs.concat(q);	
		}
		for(int i=1;i<lp;i+=2)	
		{
			c=es.charAt(i);
			q=""+c;
			fs=fs.concat(q);
		}
		JOptionPane.showMessageDialog(null, "Encryption done");
		JOptionPane.showMessageDialog(null, "Check file at D:\\ENCRYPTED.txt");
		//System.out.println(fs);
		//JOptionPane.showMessageDialog(null, "The Encrypted Text is "+fs);
		try {
			 
		    
			 PrintStream myconsole=new PrintStream(new File("D:\\ENCRYPTED.txt"));
			 System.setOut(myconsole);
			 myconsole.print(fs);
		 }catch(FileNotFoundException fx){
			 //System.out.print(fx);
		 };
	}

}
