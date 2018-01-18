
public class Tomorse {
	public String Display(String s)
	{
		String ms="",sc=s;
		char c;
		//System.out.println(sc);
		int n=sc.length();
		//System.out.println(n);
		for(int i=0;i<n;i++)
		{
			c=s.charAt(i);
			//System.out.println(c);
			switch(c)
                {
                   case 'A':
                   case 'a':ms=ms.concat(".- ");break;
				   case 'B':
				   case 'b':ms=ms.concat("-... ");break;
				   case 'C':
				   case 'c':ms=ms.concat("-.-. ");break;
				   case 'D':
				   case 'd':ms=ms.concat("-.. ");break;
				   case 'E':
				   case 'e':ms=ms.concat(". ");break;
				   case 'F':
				   case 'f':ms=ms.concat("..-. ");break;
				   case 'G':
				   case 'g':ms=ms.concat("--. ");break;
				   case 'H':
				   case 'h':ms=ms.concat(".... ");break;
				   case 'I':
				   case 'i':ms=ms.concat(".. ");break;
				   case 'J':
				   case 'j':ms=ms.concat(".--- ");break;
				   case 'K':
				   case 'k':ms=ms.concat("-.- ");break;
				   case 'L':
				   case 'l':ms=ms.concat(".-.. ");break;
				   case 'M':
				   case 'm':ms=ms.concat("-- ");break;
				   case 'N':
				   case 'n':ms=ms.concat("-. ");break;
				   case 'O':
				   case 'o':ms=ms.concat("--- ");break;
				   case 'P':
				   case 'p':ms=ms.concat(".--. ");break;
				   case 'Q':
				   case 'q':ms=ms.concat("--.- ");break;
				   case 'R':
				   case 'r':ms=ms.concat(".-. ");break;
				   case 'S':
				   case 's':ms=ms.concat("... ");break;
				   case 'T':
				   case 't':ms=ms.concat("- ");break;
				   case 'U':
				   case 'u':ms=ms.concat("..- ");break;
				   case 'V':
				   case 'v':ms=ms.concat("...- ");break;
				   case 'W':
				   case 'w':ms=ms.concat(".-- ");break;
				   case 'X':
				   case 'x':ms=ms.concat("-..- ");break;
				   case 'Y':
				   case 'y':ms=ms.concat("-.-- ");break;
				   case 'Z':
				   case 'z':ms=ms.concat("--.. ");break;
      			   case ' ':ms=ms.concat(" ");break;
      			   case '1':ms=ms.concat(".---- ");break;
      			   case '2':ms=ms.concat("..--- ");break;
      			   case '3':ms=ms.concat("...-- ");break;
      			   case '4':ms=ms.concat("....- ");break;
      			   case '5':ms=ms.concat("..... ");break;
      			   case '6':ms=ms.concat("-.... ");break;
      			   case '7':ms=ms.concat("--... ");break;
      			   case '8':ms=ms.concat("---.. ");break;
      			   case '9':ms=ms.concat("----. ");break;
      			   case '0':ms=ms.concat("----- ");break;
      			   case '.':ms=ms.concat(".-.-.- ");break;
      			   case ',':ms=ms.concat("--..-- ");break;
      			   case '?':ms=ms.concat("..--.. ");break;
      			   case '!':ms=ms.concat("-.-.-- ");break;
      			   case '/':ms=ms.concat("-..-. ");break;
      			   case ':':ms=ms.concat("---... ");break;
      			   case ';':ms=ms.concat("-.-.-. ");break;
      			   case '=':ms=ms.concat("-...- ");break;
      			   case '+':ms=ms.concat(".-.-. ");break;
      			   case '-':ms=ms.concat("-....- ");break;
      			   case '_':ms=ms.concat("..--.- ");break;
      			   case '@':ms=ms.concat(".--.-. ");break;
      			   default:ms=ms.concat("");
      			        			
      			   
                }
		}
		//System.out.println(ms);
		Convert co=new Convert();
		String js=co.binary(ms);
		return(js);
	}
}
