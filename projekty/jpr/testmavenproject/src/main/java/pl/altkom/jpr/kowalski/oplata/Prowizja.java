package pl.altkom.jpr.kowalski.oplata;

import java.util.Scanner;

public class Prowizja {
	
	private int typ_oplaty;
	boolean przez_internet;
	double kwota;
	double prowizje[][] = {{15,17,18,22,43,85,36,38,39,43,65,125,16.5,18.5,19.5,23.5,44.5,90},{9.5,13,14.5,18.5,35,70,34,36,37,41,63,123,11,14.5,16,20,36.5,71.5}};
	
	public int getTyp_oplaty() {
		return typ_oplaty;
	}

	public void setTyp_oplaty(int typ_oplaty) {
		this.typ_oplaty = typ_oplaty;
	}

	public boolean isPrzez_internet() {
		return przez_internet;
	}

	public void setPrzez_internet(boolean przez_internet) {
		this.przez_internet = przez_internet;
	}

	public double getKwota() {
		return kwota;
	}

	public void setKwota(double kwota) {
		this.kwota = kwota;
	}
	
	int ustalPrzedzialKwotowy(double kwota) {
		int zmiennaPomocnicza = 0;
		if ((kwota >= 0.01) && (kwota <=200)) zmiennaPomocnicza = 1;
		else if ((kwota > 200) && (kwota <=300)) zmiennaPomocnicza = 2;
		else if ((kwota > 300) && (kwota <=500)) zmiennaPomocnicza = 3;
		else if ((kwota > 500) && (kwota <=1000)) zmiennaPomocnicza = 4;
		else if ((kwota > 1000) && (kwota <=5000)) zmiennaPomocnicza = 5;
		else if (kwota > 5000) zmiennaPomocnicza = 6;
		else 	zmiennaPomocnicza = 0;	
		return zmiennaPomocnicza;
	}
	
	public double znajdz_prowizje(boolean przezInternet, int typPrzelewu, double kwota) {
		int przedzial = ustalPrzedzialKwotowy(kwota);
		int pierwszyIndexTablicyProwizje;
		if (przezInternet == false) pierwszyIndexTablicyProwizje = 0;
		else pierwszyIndexTablicyProwizje = 1;
		int drugiIndexTablicyProwizje = (typPrzelewu-1)*6 + przedzial;
		return prowizje[pierwszyIndexTablicyProwizje][drugiIndexTablicyProwizje];
	}

	public static void main(String[] args) {
		Prowizja p = new Prowizja();
		System.out.print("Nacisnij klawisz I, jesli chcesz ");
		System.out.println("dokonac oplaty przez intenet.");
		System.out.print("Nacisnij klawisz P, jesli chcesz ");
		System.out.println("dokonac oplaty na poczcie.");
		
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		
		if(text.equals("I")) {
			p.setPrzez_internet(true);
		}
		else if (text.equals("P")) {
			p.setPrzez_internet(false);
		}
		else {
			System.out.print("Nie zostal wybrany zaden typ oplaty.");
			System.out.println("Program zakonczy dzialanie.");
			input.close();
			return;
		}
		
		System.out.println("Podaj typ oplaty: ");
		String text1 = input.nextLine();
		int liczba = Integer.parseInt(text1);
		if((liczba<1)||(liczba>3)) {
			System.out.println("Zostal podany nieprawidlowy typ oplaty");
			input.close();
			return;
		}
		p.setTyp_oplaty(liczba);
		
		System.out.println("Podaj kwote: ");
		text1 = input.nextLine();
		double Liczba = Double.parseDouble(text1);
		p.setKwota(Liczba);
		double prowizja = p.znajdz_prowizje(p.isPrzez_internet(),p.getTyp_oplaty(),p.getKwota());
		if((prowizja < 0.01) && (prowizja > -0.01) ) {
			System.out.println("Zostala podana nieprawidlowa kwota.");
		}
		else
		System.out.println("Oplata wynosi " + prowizja);
		input.close();
	}
}
