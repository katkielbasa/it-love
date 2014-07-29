package pl.altkom.jpr.nitecki.sredniaOcen;

public class ObliczaczSredniej {

	public static void main(String[] args) {

		Subject sub = new Subject();

		sub.setSubjectName("Parapsychologia");

		/** dot�d chyba jasne */

		System.out.println(sub.getSubjectName());
		
		float subjectNotes[] = {3,3,3,3,3,3,5,3,3,4,5,3,3};

		sub.setSubjectNotes(subjectNotes);;
		
		CountSubjectAverage avg = new CountSubjectAverage();
		
		avg.setTab(sub.getSubjectNotes());
		avg.countAverage();

	}

}
