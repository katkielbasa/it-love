package pl.altkom.jpr.rosinska;

public class Ekspres {

	public double calculatePayment(String typ, double wartosc,
			boolean czyInternet) {
		if (typ == "teraz") {
			Teraz kosztPrzelewu = new Teraz();
			if (czyInternet) {
				return kosztPrzelewu.internet(wartosc);
			} else {
				return kosztPrzelewu.poczta(wartosc);
			}
		} else if (typ == "dzis") {
			Dzis kosztPrzelewu = new Dzis();
			if (czyInternet) {
				return kosztPrzelewu.internet(wartosc);
			} else {
				return kosztPrzelewu.poczta(wartosc);
			}
		} else if (typ == "jutro") {
			Jutro kosztPrzelewu = new Jutro();
			if (czyInternet) {
				return kosztPrzelewu.internet(wartosc);
			} else {
				return kosztPrzelewu.poczta(wartosc);
			}
		} else
			return 0.00;
	}
}
