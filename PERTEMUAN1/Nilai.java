package PERTEMUAN1;

public class Nilai {
	 String nim;
	 String nama;
	 double nilaiAbsen;
	 double nilaiTugas;
	 double nilaiUTS;
	 double nilaiUAS;
	 double nilaiAkhir;

	 
	 public Nilai() {
	    
	 }

	 void cetakNilai() {
	     double nilaiAbsenPersen = nilaiAbsen * 0.10;
	     double nilaiTugasPersen = nilaiTugas * 0.20;
	     double nilaiUTSPersen = nilaiUTS * 0.30;
	     double nilaiUASPersen = nilaiUAS * 0.40;
	     this.nilaiAkhir = nilaiAbsenPersen + nilaiTugasPersen + nilaiUTSPersen + nilaiUASPersen;

	     System.out.println("Nama : " + nama);
	     System.out.println("NIM : " + nim);
	     System.out.println("Nilai Absen [10%] : " + nilaiAbsenPersen);
	     System.out.println("Nilai Tugas [20%] : " + nilaiTugasPersen);
	     System.out.println("Nilai UTS [30%] : " + nilaiUTSPersen);
	     System.out.println("Nilai UAS [40%] : " + nilaiUASPersen);
	     System.out.println("Nilai Akhir : " + nilaiAkhir);
	 }

}