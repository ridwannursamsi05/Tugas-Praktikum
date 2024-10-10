package UTS;

import java.util.Scanner;

public class Admin {
    private int passwordAdmin;

    public Admin() {
        this.passwordAdmin = 12345; // Default password
    }

    public boolean loginAdmin(int password) {
        return this.passwordAdmin == password;
    }

    public void ubahKetersediaan(Manajemen manajemen) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah kamar yang tersedia: ");
        int jumlahKamar = scanner.nextInt();
        manajemen.editKetersediaanKamar(jumlahKamar);
        System.out.println("Ketersediaan kamar telah diperbarui.");
    }
}
