package pl.altkom.jpr.nitecki.sredniaOcen;

public class CountSubjectAverage {
	float tab[];
	public void countAverage() {	

		float srednia = 0;

		float suma = 0;

		/** sumujemy dzienniczek */

		for (int i = 0; i < tab.length; i++) {
			float f = tab[i];
			suma += f;
		}

		/** liczymy srednia */

		srednia = suma / tab.length;
		
		System.out.println("�rednia ocen dla ca�ego przedmiotu: " + srednia);

	}
	public float[] getTab() {
		return tab;
	}
	public void setTab(float[] tab) {
		this.tab = tab;
	}

}
