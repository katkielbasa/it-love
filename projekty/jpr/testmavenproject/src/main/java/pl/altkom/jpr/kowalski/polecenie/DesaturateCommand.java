package pl.altkom.jpr.kowalski.polecenie;

public class DesaturateCommand implements Command {

	MainGraphicLibrary lib = new MainGraphicLibrary();
	private Image before;

	@Override
	public Image perform(Image i) {
		before = i;

		CommanHistory.log.add(this);
		return lib.desaturate(i);
	}

	@Override
	public Image rolback() {

		return before;

	}

}
