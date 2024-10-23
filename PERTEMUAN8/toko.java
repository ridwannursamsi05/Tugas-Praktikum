package PERTEMUAN8;

import java.util.Scanner;

public class toko {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] kode = new String[20];  
        String[] barang = new String[20]; 
        int[] harga = new int[20]; 
        int[] jmlbeli = new int[20];  
        int[] jmlbayar = new int[20]; 

        System.out.println("TOKO SERBA ADA");
        System.out.println("***************");
        System.out.print("Masukkan Item Barang: ");
        int jumlahItem = input.nextInt();
        for (int i = 0; i < jumlahItem; i++) {
            System.out.println("Data ke " + (i + 1));
            System.out.print("Masukkan Kode: ");
            kode[i] = input.next();
            switch (kode[i]) {
                case "a001":
                    barang[i] = "Buku";
                    harga[i] = 3000;
                    break;
                case "a002":
                    barang[i] = "Pensil";
                    harga[i] = 2000;
                    break;
                case "a003":
                    barang[i] = "Pulpen";
                    harga[i] = 5000;
                    break;
                default:
                    System.out.println("Kode tidak valid. Ulangi.");
                    i--;
                    continue;
            }

            System.out.print("Masukkan jumlah Beli: ");
            jmlbeli[i] = input.nextInt();
            jmlbayar[i] = harga[i] * jmlbeli[i];
        }

        System.out.println("\nTOKO SERBA ADA");
        System.out.println("================================================================");
        System.out.println("No  Kode    Nama Barang    Harga  Jumlah Beli  Jumlah Bayar");
        System.out.println("================================================================");

        int total = 0;
        for (int i = 0; i < jumlahItem; i++) {
            System.out.printf("%-3d %-7s %-14s %-10d %-12d %-6d\n", (i + 1), kode[i], barang[i], harga[i], jmlbeli[i], jmlbayar[i]);
            total += jmlbayar[i];
        }

        System.out.println("================================================================");
        System.out.printf( "%-50s %-6d", "Total Bayar : ", total);
        System.out.println("\n================================================================");
        input.close();
    }
}
