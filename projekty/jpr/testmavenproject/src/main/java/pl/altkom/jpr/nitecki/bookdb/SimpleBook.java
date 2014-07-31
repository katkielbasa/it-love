package pl.altkom.jpr.nitecki.bookdb;

import java.util.ArrayList;
import java.util.List;

public class SimpleBook implements BookInterface {

	private String title;
	private String authorname;
	private List<String> reviews = new ArrayList<>();

	public List<String> getReviews() {
		return reviews;
	}

	public void setReviews(List<String> reviews) {
		this.reviews = reviews;
	}

	public String getTitleInfo() {
		return title;
	}

	public void setTitleInfo(String title) {
		this.title = title;
	}

	public String getAuthorInfo() {
		return authorname;
	}

	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}


}
