package PERTEMUAN6;

public class Song {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		//Lagu Anak Ayam
		for (int i = n; i > 0; i--) {
            System.out.println("Anak ayam turun " + i);
            if (i - 1 > 0) {
                System.out.println("Mati satu tinggal " + (i - 1));
            } else {
                System.out.println("Mati satu sisa induknya");
            }
            System.out.println();
        }
	}

}
