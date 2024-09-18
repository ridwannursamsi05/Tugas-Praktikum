package PERTEMUAN3;

public class KonversiSuhu extends KonversiSuhu2 {
	double value1, value2;
	
	void celciusToFahrenheit (int c) {
		this.value1 = (9.0/5.0)*c + 32.0;
	};
	void celciusToReamur (int c) {
		this.value2 = (4.0/5.0)*c;
	};
	
	void value(){
		//Eksekusi
		System.out.println("========== HASIL ==========");
		System.out.println("C to F :  " + this.value1);
		System.out.println("C to R :  " + this.value2);
		System.out.println("F to R :  " + this.value3);
		
	}
}
