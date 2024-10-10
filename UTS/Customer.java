package UTS;

import java.util.Scanner;

public class Customer extends Admin {
    private String nama;
    private Manajemen manajemen;

    public Customer(String nama, Manajemen manajemen) {
    	// Inisialisasi admin
        super(); // Memanggil konstruktor Admin
        this.manajemen = manajemen; // Eksekusi edit pada admin agar bisa terhubung ke manajemen
        // Customer
        this.nama = nama;
    }

    public void pesanKamar() {
        if (manajemen.cekKetersediaanKamar() > 0) { //Interface
            Scanner scanner = new Scanner(System.in);
            System.out.println("Pilih tipe kamar: 1. Reguler  2. Premium");
            int tipe = scanner.nextInt();
            String tipeKamar = (tipe == 1) ? "Reguler" : "Premium";
            
            manajemen.tambahPesanan(nama + " memesan kamar " + tipeKamar);
            manajemen.editKetersediaanKamar(manajemen.cekKetersediaanKamar() - 1);
            
            System.out.println("Pesanan berhasil! Kamar " + tipeKamar + " telah dipesan.");
        } else {
            System.out.println("Maaf, kamar tidak tersedia.");
        }
    }

    public void lihatRiwayatPesanan() {
        System.out.println("Riwayat pesanan:");
        for (int i = 0; i < manajemen.getIndexPesanan(); i++) {
            System.out.println(manajemen.getRiwayatPesanan()[i]);
        }
    }
}
