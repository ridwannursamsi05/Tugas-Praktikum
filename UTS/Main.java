package UTS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Manajemen manajemen = new Manajemen();
        Admin admin = new Admin();
        Scanner scanner = new Scanner(System.in);

        while (true) { // Menu Utama
        	// Ketika masuk sebagai customer harus update dulu di admin karena di set default supaya bisa memesan kamar
            System.out.println("=== Menu Utama ===");
            System.out.println("1. Login Admin");
            System.out.println("2. Login Customer");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();

            if (pilihan == 1) {
            	//1. Login Admin
                System.out.print("Masukkan password : ");
                int password = scanner.nextInt();
                if (admin.loginAdmin(password)) {
                    while (true) {
                        System.out.println("=== Menu Admin ===");
                        System.out.println("1. Ubah Ketersediaan Kamar");
                        System.out.println("2. Kembali");
                        int adminPilihan = scanner.nextInt();
                        if (adminPilihan == 1) {
                            admin.ubahKetersediaan(manajemen);
                        } else if (adminPilihan == 2) {
                            break;  // Kembali ke menu utama
                        }
                    }
                } else {
                    System.out.println("Password salah!");
                }
            } else if (pilihan == 2) {
            	//2. Masuk Sebagai Customer
                System.out.print("Masukkan nama : ");
                String namaCustomer = scanner.next();
                Customer customer = new Customer(namaCustomer, manajemen);

                while (true) {
                    System.out.println("=== Menu Customer ===");
                    System.out.println("1. Pesan Kamar");
                    System.out.println("2. Cek Ketersediaan Kamar");
                    System.out.println("3. Lihat Riwayat Pesanan");
                    System.out.println("4. Kembali");
                    int customerPilihan = scanner.nextInt();
                    if (customerPilihan == 1) {
                        customer.pesanKamar();
                    } else if (customerPilihan == 2) {
                        System.out.println("Ketersediaan kamar: " + manajemen.cekKetersediaanKamar());
                    } else if (customerPilihan == 3) {
                        customer.lihatRiwayatPesanan();
                    } else if (customerPilihan == 4) {
                        break;  // Kembali ke menu utama
                    }
                }
            } else if (pilihan == 3) {
            	// 3. Exit
                System.out.println("Terima kasih!");
                break;  // Keluar dari program
            }
        }
    }
}
