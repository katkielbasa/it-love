package pl.altkom.jpr.kowalski.polecenie;

public class MainGraphicLibrary {


	public Image desaturate(Image i){
		System.out.println("desaturate");
		Image i2 = new Image();
		i2.state = i.state+1;
		return i2;
	}
	public Image saturate(Image i){
		System.out.println("saturate");
		Image i2 = new Image();
		i2.state = i.state+1;
		return i2;
	}
	public Image changeREsolution(Image i){
		System.out.println("chanigi resolution");
		Image i2 = new Image();
		i2.state = i.state+1;
		return i2;
	}
}
