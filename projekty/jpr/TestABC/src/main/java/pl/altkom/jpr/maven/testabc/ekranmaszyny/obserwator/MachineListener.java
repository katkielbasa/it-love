package pl.altkom.jpr.maven.testabc.ekranmaszyny.obserwator;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * watek, ktory nasluchuej na porcie na informacje czy odswierzyc ekran
 * 
 * @author instruktor
 * 
 */
public class MachineListener extends Thread implements Observable {

	private List<Observator> observators = new ArrayList<>();
	
	boolean end = false;

	@Override
	public void run() {

		int portNumber = 4443;

		ServerSocket serverSocket;
		try {
			serverSocket = new ServerSocket(portNumber);

			while (!end) {
				System.out.println("czelka na polaczenie");
				Socket clientSocket = serverSocket.accept();
				System.out.println("ip : "+clientSocket.getRemoteSocketAddress().toString());
				notifyObservers();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// PrintWriter out = new PrintWriter(clientSocket.getOutputStream(),
		// true);
		// BufferedReader in = new BufferedReader(new InputStreamReader(
		// clientSocket.getInputStream()));


	}
	
	
	 


	@Override
	public void addObservator(Observator o) {
		observators.add(o);
		
	}


	@Override
	public void notifyObservers() {
		for (Observator o : observators) {
			o.update();
			
		}
		
	}

	/** 
	 * 0 - telefon
	 * 1 - ekran
	 * 2 - hstoria
	 */
	@Override
	public void removeObserver(int id) {
		int elementid = 0;
		elementid = calculateElementPosition(id, elementid);
		observators.remove(elementid);
		
	}





	private int calculateElementPosition(int id, int elementid) {
		for (int i = 0; i < observators.size(); i++) {
			Observator element = observators.get(i);
			if (id == 0){
				if (element instanceof Telefon ){
					elementid = i;
				}
			}
			if (id == 1){
				if (element instanceof Ekran ){
					elementid = i;
				}
			}
			if (id == 1){
				if (element instanceof HistoriaProdukcji ){
					elementid = i;
				}
			}	
		}
		return elementid;
	}
		
}
