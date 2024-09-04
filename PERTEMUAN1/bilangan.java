package PERTEMUAN1;

public class bilangan {
	int pencacah = 0;
	int nilai;
	
	public bilangan (int nilai) {
	this.nilai = nilai;
	pencacah++;
	}
	
	public void info() {
	System.out.println("nilai:" + nilai);
	System.out.println("pencacah:" + pencacah);
	System.out.println("");
	}
}
