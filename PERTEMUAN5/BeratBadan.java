package PERTEMUAN5;

import java.util.Scanner;

public class BeratBadan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner beratbadan = new Scanner(System.in);
		Scanner tinggibadan = new Scanner(System.in);
		
		System.out.print("Berat Badan (kg) : " );
		Double bb = beratbadan.nextDouble();
		System.out.print("Tinggi Badan (m) : ");
		Double tb = tinggibadan.nextDouble();
		
		double imt = bb/(tb*tb);
		String krt = "";

		if (imt <= 18.4) {
			System.out.println("\n==============================");
			krt = "Berat Badan Kurang";
			System.out.println("IMT : " + imt);
			System.out.println("Kriteria : " + krt);
			System.out.println("==============================");
		} else if (imt <= 24.9) {
			System.out.println("\n==============================");
			krt = "Berat Badan Ideal";
			System.out.println("IMT : " + imt);
			System.out.println("Kriteria : " + krt);
			System.out.println("==============================");
		} else if (imt <= 29.9) {
			System.out.println("\n==============================");
			krt = "Berat Badan Lebih";
			System.out.println("IMT : " + imt);
			System.out.println("Kriteria : " + krt);
			System.out.println("==============================");
		} else if (imt <= 39.9) {
			System.out.println("\n==============================");
			krt = "Gemuk";
			System.out.println("IMT : " + imt);
			System.out.println("Kriteria : " + krt);
			System.out.println("==============================");
		} else {
			System.out.println("\n==============================");
			krt = "Sangat Gemuk";
			System.out.println("IMT : " + imt);
			System.out.println("Kriteria : " + krt);
			System.out.println("==============================");		}
	}

}
