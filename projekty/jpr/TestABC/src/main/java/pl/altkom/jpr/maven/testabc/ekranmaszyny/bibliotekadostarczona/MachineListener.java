package pl.altkom.jpr.maven.testabc.ekranmaszyny.bibliotekadostarczona;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * watek, ktory nasluchuej na porcie na informacje czy odswierzyc ekran
 * 
 * @author instruktor
 * 
 */
public class MachineListener extends Thread {

	private Ekran ekran;
	
	boolean end = false;

	@Override
	public void run() {

		int portNumber = 4444;

		ServerSocket serverSocket;
		try {
			serverSocket = new ServerSocket(portNumber);

			while (!end) {
				System.out.println("czelka na polaczenie");
				Socket clientSocket = serverSocket.accept();
				System.out.println("ip : "+clientSocket.getRemoteSocketAddress().toString());
				ekran.refresh();
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
	
	
	public MachineListener(Ekran ekran){
		this.ekran = ekran;
		
	}
		
}
