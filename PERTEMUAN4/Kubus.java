package PERTEMUAN4;

public class Kubus {
	double s;
	protected double alas;
	
	public Kubus(double s, double alas) {
		this.s = s;
		this.alas = alas;
	}
	
	public Kubus(double alas) {
		this.alas = alas;
		s = 5;
	}
	
	public double volume() {
		return s*s*s;
	}
	
	public double luasp () {
		return alas*(s*s);
	}
}
