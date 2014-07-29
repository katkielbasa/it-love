package pl.altkom.jpr.maven.testabc.fasadademo.test;

import pl.altkom.jpr.maven.testabc.fasadademo.MatematicFascade;
import pl.altkom.jpr.maven.testabc.fasadademo.StandardMathLibrary;

public class Test {

	public static void main(String[] args) {
//		StdMLib lib = new StdMLib();
//		lib.dodawaj(20d);
		
		MatematicFascade fasada = new MatematicFascade();
		fasada.add(20d);
	}

}
