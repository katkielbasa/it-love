package pl.altkom.jpr.maven.testabc.books;

 

public class SimpleBookViewer {

 
	public void show(SimpleBook book) {
		

		System.out.println(book.getAuthorInfo());
		System.out.println(book.getTitleInfo());
		if (book.getReviews() == null)
		System.out.println("Brak recenzji");
		else
		System.out.println(book.getReviews());
		
	}

	

}
