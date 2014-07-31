package pl.altkom.jpr.kowalski.polecenie;

public interface Command {

	public Image perform(Image i);
	public Image rolback();
}
