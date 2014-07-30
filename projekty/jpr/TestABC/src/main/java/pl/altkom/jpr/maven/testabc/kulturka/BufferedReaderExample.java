package pl.altkom.jpr.maven.testabc.kulturka;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 
public class BufferedReaderExample {
 
	public static void main(String[] args) {
 
		KulturkaReader br = null;
 
		try {
 
			
			String sCurrentLine;
 
			br = new KulturkaReader(new BufferedReader(new FileReader("C:\\users\\instruktor\\testing.txt")));
 
			while ((sCurrentLine = br.readKulturkaLine()) != null) {
				System.out.println(sCurrentLine);
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
 
	}
}