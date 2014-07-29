package pl.altkom.jpr.instruktor.omdb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

/**
 * Klasa odpoweidzialna za odczyt danych o filmach z systemu OMDB
 * 
 * @author instruktor
 * 
 */
public class OmdbBrowserApi {

	public List<Film> searchMovie(String movie) {

		movie = movie.replace(" ", "%20");
		URL url = null;
		try {
			
			url = new URL("http://www.omdbapi.com/?s=" + movie + "&r=XML");

			if (url == null) {
				return null;
			}

			InputStreamReader is = new InputStreamReader(url.openStream());
			BufferedReader readed = new BufferedReader(is);
			String line = null;
			while( (line = readed.readLine()) != null){
				System.out.println(line);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

}
