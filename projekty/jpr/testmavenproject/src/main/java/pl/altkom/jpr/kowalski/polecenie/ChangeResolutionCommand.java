package pl.altkom.jpr.kowalski.polecenie;

public class ChangeResolutionCommand implements Command {

	MainGraphicLibrary lib = new MainGraphicLibrary();
	private Image before;

	@Override
	public Image perform(Image i) {
		before = i;

		CommanHistory.log.add(this);
		return lib.changeREsolution(i);
	}

	@Override
	public Image rolback() {

		return before;

	}

}
