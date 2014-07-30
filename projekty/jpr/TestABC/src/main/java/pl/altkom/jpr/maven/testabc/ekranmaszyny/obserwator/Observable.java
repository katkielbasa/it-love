package pl.altkom.jpr.maven.testabc.ekranmaszyny.obserwator;

public interface Observable {

	
	public void addObservator(Observator o);
	
	public void notifyObservers();
	
	public void removeObserver(int id);
}
