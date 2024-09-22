package PERTEMUAN4;

public class Balok {
	double p,l,t;
	
	public Balok(double p, double l,double t) {
		this.p=p;
		this.l=l;
		this.t=t;
	}
	
	public Balok(double p, double l) {
		this.p=p;
		this.l=l;
		t = 5;
	}
	
	public double volume() {
		return p*l*t;
	}
	
	public double luasp () {
		return 2*(p*l + p*t + l*t);
	}

}
