package pl.altkom.jpr.maven.testabc.ekranmaszyny.obserwator;

public class HistoriaProdukcji implements Observator {

	@Override
	public void update() {
		System.out.println("zarejestrowano wyniki w bazie");

	}

}
