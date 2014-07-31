package pl.altkom.jpr.kowalski.polecenie;

import java.util.ArrayList;

public class CommanHistory {
	
	public static ArrayList<Command> log = new ArrayList<>();
	
	public static Image back(){
		
		return log.get(log.size()-1).rolback();
		
	}
	

}
