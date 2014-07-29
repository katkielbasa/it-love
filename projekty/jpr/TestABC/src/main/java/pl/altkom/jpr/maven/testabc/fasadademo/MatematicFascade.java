package pl.altkom.jpr.maven.testabc.fasadademo;

public class MatematicFascade {

	private StandardMathLibrary stdMLib = new StandardMathLibrary();
	private StatisticLib statisticLib = new StatisticLib();
	
	public double add(double d){
		return stdMLib.dodawaj(d);
	}
}
