package pl.altkom.jpr.maven.testabc.books;

import java.util.List;

public class NBookAdapter extends SimpleBook {

	private NBook nbook;

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
		this.nbook = nbook;
	}

}
