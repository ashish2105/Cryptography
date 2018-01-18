import java.io.*;
import java.util.*;
public class Dfvalue {
	public String readFile(String pathname) throws IOException {

	    File file = new File(pathname);
	    StringBuilder fileContents = new StringBuilder((int)file.length());
	    Scanner scanner = new Scanner(file);
	   // String lineSeparator = System.getProperty("line.separator");

	    try {
	        while(scanner.hasNextLine()) {        
	            fileContents.append(scanner.nextLine());
	        }
	        //System.out.print(fileContents);
	        return fileContents.toString();
	    } finally {
	        scanner.close();
	    }
	}
}
