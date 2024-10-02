package PERTEMUAN5;

import java.util.Scanner;

public class RekapNilai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner npm = new Scanner(System.in);
		Scanner nama = new Scanner(System.in);
		Scanner nAbsen = new Scanner(System.in);
		Scanner nTugas = new Scanner(System.in);
		Scanner nUts = new Scanner(System.in);
		Scanner nUas = new Scanner(System.in);
		
		System.out.print("NPM : ");
		String Npm = npm.nextLine();
		System.out.print("Nama Mahasiswa : ");
		String Nama = nama.nextLine();
		System.out.print("Nilai Kehadiran : ");
		double Nabsen = nAbsen.nextDouble();
		System.out.print("Nilai Tugas : ");
		double Ntugas = nTugas.nextDouble();
		System.out.print("Nilai UTS : ");
		double Nuts = nUts.nextDouble();
		System.out.print("Nilai UAS : ");
		double Nuas = nUas.nextDouble();
		
		double nilaiAkhir = Nabsen*0.10 + Ntugas*0.20 + Nuts*0.30 + Nuas*0.40;
		String grade = "Undefined";
		String ktr = "Undefined";

		if (nilaiAkhir <= 45) {
			System.out.println("\n===========================");
			grade = "E";
			ktr = "KURANG SEKALI";
			System.out.println("NPM : " + Npm);
			System.out.println("Nama Mahasiswa : " + Nama);
			System.out.println("Nilai Rata-Rata : " + nilaiAkhir);
			System.out.println("Grade : " + grade);
			System.out.println("Keterangan : " + ktr);
			System.out.println("===========================");
		} else if (nilaiAkhir <= 55) {
			System.out.println("\n===========================");
			grade = "D";
			ktr = "KURANG";
			System.out.println("NPM : " + Npm);
			System.out.println("Nama Mahasiswa : " + Nama);
			System.out.println("Nilai Rata-Rata : " + nilaiAkhir);
			System.out.println("Grade : " + grade);
			System.out.println("Keterangan : " + ktr);
			System.out.println("===========================");
		} else if (nilaiAkhir <= 65) {
			System.out.println("\n===========================");
			grade = "C";
			ktr = "CUKUP";
			System.out.println("NPM : " + Npm);
			System.out.println("Nama Mahasiswa : " + Nama);
			System.out.println("Nilai Rata-Rata : " + nilaiAkhir);
			System.out.println("Grade : " + grade);
			System.out.println("Keterangan : " + ktr);
			System.out.println("===========================");
		} else if (nilaiAkhir <= 75) {
			System.out.println("\n===========================");
			grade = "B";
			ktr = "BAIK";
			System.out.println("NPM : " + Npm);
			System.out.println("Nama Mahasiswa : " + Nama);
			System.out.println("Nilai Rata-Rata : " + nilaiAkhir);
			System.out.println("Grade : " + grade);
			System.out.println("Keterangan : " + ktr);
			System.out.println("===========================");
		} else if (nilaiAkhir <= 100){
			System.out.println("\n===========================");
			grade = "A";
			ktr = "ISTIMEWA";
			System.out.println("NPM : " + Npm);
			System.out.println("Nama Mahasiswa : " + Nama);
			System.out.println("Nilai Rata-Rata : " + nilaiAkhir);
			System.out.println("Grade : " + grade);
			System.out.println("Keterangan : " + ktr);
			System.out.println("===========================");
		} else {
			System.out.println("\n===========================");
			System.out.println("NPM : " + Npm);
			System.out.println("Nama Mahasiswa : " + Nama);
			System.out.println("Nilai Rata-Rata : " + nilaiAkhir + " >>>> Nilai Error !!");
			System.out.println("Grade : " + grade);
			System.out.println("Keterangan : " + ktr);
			System.out.println("===========================");
		}
	}

}
