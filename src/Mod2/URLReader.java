/**
 * 
 */
package Mod2;

import java.net.*;
import java.io.*;


/**
 * @author Teresa Scudder
 * @date 2/5/2020
 */
public class URLReader {
	String fileString;

	public String main() throws MalformedURLException {

		// create the URL
		URL file = new URL("http://shakespeare.mit.edu/macbeth/full.html");

		// Open the URL stream and create readers convert to string
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new InputStreamReader(file.openStream()));
			
			// write the output
			StringBuilder response = new StringBuilder();
			String inputLine;
			while ((inputLine = reader.readLine()) != null)
				response.append(inputLine);
			
			// close reader
			reader.close();
			
			fileString = inputLine;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("error");
		}

		
		return fileString.toString();

	}

}
