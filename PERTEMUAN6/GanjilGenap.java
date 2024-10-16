package PERTEMUAN6;

public class GanjilGenap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		//Bilangan Genap
        System.out.println("Bilangan Genap : ");
		for (x = 0; x <= 20; x++) {
            if (x % 2 == 0) {
            	System.out.print(x + " ");
            }
        }
		//Bilangan Ganjil
        System.out.println("\nBilangan Ganjil : ");
		for (x = 0; x <= 20; x++) {
            // Memeriksa apakah bilangan genap
            if (x % 2 == 0) {
                System.out.print("");
            }
            // Memeriksa apakah bilangan ganjil
            else {
                System.out.print(x + " ");
            }
        }

	}

}
