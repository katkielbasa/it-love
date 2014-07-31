package pl.altkom.jpr.nitecki.bookdb.viewer;

import pl.altkom.jpr.nitecki.bookdb.*;

public class SimpleBookViewer {

	BookInterface book = null;
	
	public void show() {
		
		book.getAuthorInfo();
		book.getTitleInfo();
		book.getReviews();
		
		

		System.out.println(book.getAuthorInfo());
		System.out.println(book.getTitleInfo());
		if (book.getReviews() == null)
		System.out.println("Brak recenzji");
		else
		System.out.println(book.getReviews());
		
	}

	public SimpleBookViewer(BookInterface book) {
		super();
		this.book = book;
	}

}
