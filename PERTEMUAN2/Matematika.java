package PERTEMUAN2;

public class Matematika implements interfaceMatematika {
    public int value1, value2, value3, value4;
    
    public void pertambahan(int a, int b) {
        this.value1 = a + b;
    }
    
    public void pengurangan(int a, int b) {
        this.value2 = a - b;
    }
    
    public void perkalian(int a, int b) {
        this.value3 = a * b;
    }
    
    public void pembagian(int a, int b) {
        this.value4 = a / b;
    }
    
    public void value() {
        // Eksekusi
        System.out.println("========== HASIL ==========");
        System.out.println("Pertambahan : 20 + 10 = " + this.value1);
        System.out.println("Pengurangan : 10 - 5 = " + this.value2);
        System.out.println("Perkalian   : 10 * 3 = " + this.value3);
        System.out.println("Pembagian   : 21 / 2 = " + this.value4);
    }
}


