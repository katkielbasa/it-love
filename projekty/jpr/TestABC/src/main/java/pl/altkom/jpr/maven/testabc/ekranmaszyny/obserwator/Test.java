package pl.altkom.jpr.maven.testabc.ekranmaszyny.obserwator;

public class Test {


	public static void main(String args[]){
		Ekran ekran = new Ekran();
		Telefon telefon = new Telefon();
		MachineListener listener = new MachineListener();
		listener.start();
		listener.addObservator(telefon);
		listener.addObservator(ekran);
		listener.addObservator(new HistoriaProdukcji());
		
		try {
			Thread.sleep(10000);
			listener.removeObserver(0);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
