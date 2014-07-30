package pl.altkom.jpr.maven.testabc.kulturka;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class KulturkaReader extends Reader{

	
	private BufferedReader parent;
	
	public KulturkaReader(BufferedReader reader){
		parent = reader;
		
	}
	
	
	public String readKulturkaLine(){
		
		try {
			String linia = parent.readLine();
			if(linia == null){
				return null;
			}
			linia = linia.replaceAll("kurka", "...");
			
			
			return linia;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	@Override
	public void close() throws IOException {
		
		
	}

	@Override
	public int read(char[] cbuf, int off, int len) throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

}
