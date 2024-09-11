package LATIHAN;

public class Matematika {
		public int value1, value2, value3, value4;
		void pertambahan (int a, int b) {
			this.value1 = a + b;
		};
		void pengurangan (int a, int b) {
			this.value2 = a - b;
		};
		void perkalian (int a, int b) {
			this.value3 = a * b;
		};
		void pembagian (int a, int b) {
			this.value4 = a / b;
		};
		
		public void value(){
			//Eksekusi
			System.out.println("========== HASIL ==========");
			System.out.println("Pertambahan : 20 + 10 = " + this.value1);
			System.out.println("Pengurangan : 10 - 5 = " + this.value2);
			System.out.println("Pengurangan : 10 * 3 = " + this.value3);
			System.out.println("Pengurangan : 21 / 2 = " + this.value4 );
			
		}
}
