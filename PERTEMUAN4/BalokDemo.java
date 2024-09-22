package PERTEMUAN4;

public class BalokDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Balok b = new Balok(4,2,5);
		Balok b2 = new Balok(4,4);
		
		//3 parameter
		System.out.println("Volume Balok : " + b.volume());
		System.out.println("Luas Permukaan Balok : " + b.luasp() + "\n");
		
		//2 parameter
		System.out.println("Volume Balok : " + b2.volume());
		System.out.println("Luas Permukaan Balok : " + b2.luasp());
	}

}
