package pl.altkom.jpr.kielbasa;

public class SmallestSearch {
	// szuka najmniejszego elementu w tablicy
	public Integer smallestSearch(int[] tab) {
		// zwraca najmniejsz� warto�� tablicy
                if (tab == null ){
			return null;
		}
		if (tab.length == 0 ){
			return null;
		}

		Integer temporarySmallestValue = tab[0];
		for (int i = 1; i < tab.length; i++) {
			if (temporarySmallestValue > tab[i]) {
				temporarySmallestValue = tab[i];
			}
		}
		System.out.println("to jest najmniejsza warto�� tablicy: "
				+ temporarySmallestValue);
		return temporarySmallestValue;

	}

}
