package pl.altkom.jpr.nitecki.bookdb;

import java.util.List;

public class NBookAdapter implements BookInterface {

	
	
	private NBook nbook = new NBook();

	@Override
	public String getTitleInfo() {

		return nbook.getTitle() + ": " + nbook.getSubtitle();
	}

	@Override
	public String getAuthorInfo() {

		return nbook.getAuthorname() + " " + nbook.getAuthorlastname();
	}

	@Override
	public List<String> getReviews() {
		return null;
	}

	public NBookAdapter(NBook nbook) {
		super();
		this.nbook = nbook;
	}

}
