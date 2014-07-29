package pl.altkom.jpr.maven.testabc.animals;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 
public class ConfigurationReader {
 
	public String readConfigClass() {
 
		BufferedReader br = null;
 
		try {
 
			String sCurrentLine;
 
			br = new BufferedReader(new FileReader("C:\\users\\instruktor\\class.txt"));
 
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
				return sCurrentLine;
			}
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return "";
 
	}
}