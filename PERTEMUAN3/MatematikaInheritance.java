package PERTEMUAN3;

public class MatematikaInheritance {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matematika matematika = new Matematika();
			
		matematika.pertambahan(20,10);
		matematika.pengurangan(10,5);
		matematika.perkalian(10, 3);
		matematika.pembagian(21, 2);
		matematika.modulus(21,2);
			
		//Hasil
		matematika.value();
			
		}
}
