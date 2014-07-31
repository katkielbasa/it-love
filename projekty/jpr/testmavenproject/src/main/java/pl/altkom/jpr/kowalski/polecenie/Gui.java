package pl.altkom.jpr.kowalski.polecenie;

public class Gui {

	public static void main(String args[]){
		
		Image i = new Image();
		
		DesaturateCommand ds = new DesaturateCommand();
		SaturateCommand sa = new SaturateCommand();
		ChangeResolutionCommand cr = new ChangeResolutionCommand();
		
		i = ds.perform(i);
		System.out.println(i.state);
		i = sa.perform(i);
		System.out.println(i.state);
		i = cr.perform(i);
		System.out.println(i.state);
	
		i = CommanHistory.back();
		
		System.out.println(i.state);
	}
}

