package PERTEMUAN3;

public class DemoKonversiSuhu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KonversiSuhu conv = new KonversiSuhu();
		
		conv.celciusToFahrenheit(30);
		conv.celciusToReamur(30);
		conv.fahrenheitToReamur(77);
		
		//Hasil
		conv.value();
	}

}
