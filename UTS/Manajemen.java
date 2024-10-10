package UTS;

public class Manajemen extends Customer implements KetersediaanKamar {
    private int jumlahKamar;
    private String[] riwayatPesanan = new String[100]; // Maks array
    private int indexPesanan = 0; // Ngecopy riwayat pesanan terakhir

    public Manajemen() {
    	// Insialisasi Customer
    	// Default variable
        super("Default Customer", null); // Memanggil konstruktor Customer
        this.jumlahKamar = 0;
    }

    public void editKetersediaanKamar(int jumlahKamar) {
        this.jumlahKamar = jumlahKamar;
    }

    public int cekKetersediaanKamar() {
        return this.jumlahKamar;
    }

    public void tambahPesanan(String pesanan) {
        if (indexPesanan < riwayatPesanan.length) {
        	//length menghitung panjang array agar mengupdate output Riwayat pesanan setiap ada customer memesan lagi
            riwayatPesanan[indexPesanan] = pesanan;
            indexPesanan++;
        } else {
            System.out.println("Riwayat pesanan penuh!");
        }
    }

    public String[] getRiwayatPesanan() {
        return riwayatPesanan;
    }

    public int getIndexPesanan() {
        return indexPesanan;
    }
}
