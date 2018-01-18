import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

import javax.swing.JOptionPane;

public class Dmorse {
	public void doutput(String s)
	{
		String audi=s,gtr="",fout="";
		int ml=audi.length();
		for(int i=0;i<ml;i++)
		{
			int k=audi.indexOf(' ');
			//System.out.println(k);
			gtr=audi.substring(0,k);
			//System.out.println(gtr);
			switch(gtr)
			{
				case ".-":fout=fout.concat("A");break;
				case "-...":fout=fout.concat("B");break;
				case "-.-.":fout=fout.concat("C");break;
				case "-..":fout=fout.concat("D");break;
				case ".":fout=fout.concat("E");break;
				case "..-.":fout=fout.concat("F");break;
				case "--.":fout=fout.concat("G");break;
				case "....":fout=fout.concat("H");break;
				case "..":fout=fout.concat("I");break;
				case ".---":fout=fout.concat("J");break;
				case "-.-":fout=fout.concat("K");break;
				case ".-..":fout=fout.concat("L");break;
				case "--":fout=fout.concat("M");break;
				case "-.":fout=fout.concat("N");break;
				case "---":fout=fout.concat("O");break;
				case ".--.":fout=fout.concat("P");break;
				case "--.-":fout=fout.concat("Q");break;
				case ".-.":fout=fout.concat("R");break;
				case "...":fout=fout.concat("S");break;
				case "-":fout=fout.concat("T");break;
				case "..-":fout=fout.concat("U");break;
				case "...-":fout=fout.concat("V");break;
				case ".--":fout=fout.concat("W");break;
				case "-..-":fout=fout.concat("X");break;
				case "-.--":fout=fout.concat("Y");break;
				case "--..":fout=fout.concat("Z");break;
				case "-----":fout=fout.concat("0");break;
				case ".----":fout=fout.concat("1");break;
				case "..---":fout=fout.concat("2");break;
				case "...--":fout=fout.concat("3");break;
				case "....-":fout=fout.concat("4");break;
				case ".....":fout=fout.concat("5");break;
				case "-....":fout=fout.concat("6");break;
				case "--...":fout=fout.concat("7");break;
				case "---..":fout=fout.concat("8");break;
				case "----.":fout=fout.concat("9");break;
				case ".-.-.-":fout=fout.concat(".");break;
				case "--..--":fout=fout.concat(",");break;
				case "..--..":fout=fout.concat("?");break;
				case "-.-.--":fout=fout.concat("!");break;
				case "-..-.":fout=fout.concat("/");break;
				case "---...":fout=fout.concat(":");break;
				case "-.-.-.":fout=fout.concat(";");break;
				case "-...-":fout=fout.concat("=");break;
				case ".-.-.":fout=fout.concat("+");break;
				case "-....-":fout=fout.concat("-");break;
				case "..--.-":fout=fout.concat("_");break;
				case ".--.-.":fout=fout.concat("@");break;
				
			}
			if(k==0)
			{
				fout=fout.concat(" ");
			}
			audi=audi.substring(k+1);
			//System.out.println(audi);
			ml=ml-k;
		}
		//JOptionPane.showMessageDialog(null,"The decrypted text is "+ fout);
		//Frame5 fdo=new Frame5();
		//fdo.fscreen();
		//fdo.odsp(fout);
		JOptionPane.showMessageDialog(null, "Decryption done");
		JOptionPane.showMessageDialog(null, "Check file at D:\\DECRYPTED.txt");
		try {
			 
		    
			 PrintStream myconsole=new PrintStream(new File("D:\\DECRYPTED.txt"));
			 System.setOut(myconsole);
			 myconsole.print(fout);
		 }catch(FileNotFoundException fx){
			 //System.out.print(fx);
		 };
	}
}
