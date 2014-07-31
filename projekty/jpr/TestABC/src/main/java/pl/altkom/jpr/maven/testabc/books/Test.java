package pl.altkom.jpr.maven.testabc.books;

import java.util.ArrayList;
import java.util.List;

 
public class Test {

	public static void main(String[] args) {
		
		SimpleBook book1 = new SimpleBook();
		
		
		book1.setAuthorname("George R.R. Martin");
		book1.setTitleInfo("Winter is NOT coming");
//		List<String> reviews = new ArrayList<>();
//		reviews.add("Straszne gie");
//		reviews.add("Najgorsza książka w historii");
//		book1.setReviews(reviews);
		book1.getReviews().add("Straszne gie");
		book1.getReviews().add("Najgorsza książka w historii");
		
		NBook book2 = new NBook();

		
		book2.setAuthorname("George R.R.");
		book2.setAuthorlastname("Martin");
		book2.setTitle("Winter is STILL NOT COMING");
		book2.setSubtitle("The art of killing your favourite characters");
		
		NBookAdapter book2c = new NBookAdapter(book2);
		
		SimpleBookViewer viewer = new SimpleBookViewer();
		viewer.show(book1);
		viewer.show(book2c);
//		System.out.println("Autor: " + book1.getAuthorInfo());
		
		
		
	 
		
	}

}


