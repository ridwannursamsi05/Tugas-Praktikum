package PERTEMUAN6;

import java.util.Scanner;

public class TableMatriksNxN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//Input Maks <=10
        System.out.print("== Matriks NxN [maks 10]! ==");
        System.out.print("\nMasukan Nilai N : ");
        int n = input.nextInt();
        //Operasi NxN
        if (n > 10) {
            System.out.println("== Nilai N tidak valid [maks:10]! ==");
        } else {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(i * j + " ");
                }
                System.out.println();
            }
        }

	}

}
