package pl.altkom.jpr.kowalski.polecenie;

public class SaturateCommand implements Command {

	MainGraphicLibrary lib = new MainGraphicLibrary();
	private Image before;

	@Override
	public Image perform(Image i) {
		before = i;

		CommanHistory.log.add(this);
		return lib.saturate(i);
	}

	@Override
	public Image rolback() {

		return before;

	}

}
