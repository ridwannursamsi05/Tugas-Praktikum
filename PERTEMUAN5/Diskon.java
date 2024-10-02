package PERTEMUAN5;

import java.util.Scanner;

public class Diskon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan Total Belanja : ");
		
		double totalPembelian = input.nextDouble();
		double diskon = 0;
		double diskon2 = 0;
		double totalBelanja = 0;
		double totalBelanja2 = 0;
		
		if(totalPembelian < 50000){
			System.out.println("===========================");
			System.out.println("Total Pembelian : " + totalPembelian);
			diskon = totalPembelian/20;
			System.out.println("Diskon : " + diskon);
			System.out.println("===========================");
			totalBelanja = totalPembelian - diskon;
			System.out.println("Jumlah yang perlu dibayar = Rp" + totalBelanja);
			} else {
				System.out.println("===========================");
				System.out.println("Total Pembelian : " + totalPembelian);
				diskon2 = totalPembelian/5;
				System.out.println("Diskon : " + diskon2);
				System.out.println("===========================");
				totalBelanja2 = totalPembelian - diskon2;
				System.out.println("Jumlah yang perlu dibayar = Rp" + totalBelanja2);
				}
	}

}
