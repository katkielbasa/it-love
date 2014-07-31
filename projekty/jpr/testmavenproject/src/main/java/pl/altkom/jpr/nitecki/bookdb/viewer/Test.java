package pl.altkom.jpr.nitecki.bookdb.viewer;

import java.util.ArrayList;
import java.util.List;

import pl.altkom.jpr.nitecki.bookdb.NBook;
import pl.altkom.jpr.nitecki.bookdb.NBookAdapter;
import pl.altkom.jpr.nitecki.bookdb.SimpleBook;

public class Test {

	public static void main(String[] args) {
		
		SimpleBook book1 = new SimpleBook();
		SimpleBookViewer viewer = new SimpleBookViewer(book1);
		
		book1.setAuthorname("George R.R. Martin");
		book1.setTitleInfo("Winter is NOT coming");
		List<String> reviews = new ArrayList<>();
		reviews.add("Straszne gowno");
		reviews.add("Najgorsza książka w historii");
		book1.setReviews(reviews);
		
		NBook book2 = new NBook();

		
		book2.setAuthorname("George R.R.");
		book2.setAuthorlastname("Martin");
		book2.setTitle("Winter is STILL NOT COMING");
		book2.setSubtitle("The art of killing your favourite characters");
		
		NBookAdapter book2c = new NBookAdapter(book2);
		
		SimpleBookViewer viewer1 = new SimpleBookViewer(book2c);
//		System.out.println("Autor: " + book1.getAuthorInfo());
		
		viewer.show();
		viewer1.show();
		
	}

}
