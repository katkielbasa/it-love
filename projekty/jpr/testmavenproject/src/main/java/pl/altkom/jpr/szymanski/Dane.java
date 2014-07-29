package pl.altkom.jpr.szymanski;

public class Dane {
	private int type;
	private double value;
	private boolean internet;

	public Dane(int type, double value, boolean internet) {
		super();
		this.type = type;
		this.value = value;
		this.internet = internet;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public boolean isInternet() {
		return internet;
	}

	public void setInternet(boolean internet) {
		this.internet = internet;
	}

}
