package PERTEMUAN4;

public class KubusDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kubus k = new Kubus(2,6);
		Kubus k2 = new Kubus(6);
		
		//2 parameter
		System.out.println("Volume Kubus : " + k.volume());
		System.out.println("Luas Permukaan Kubus : " + k.luasp() + "\n");
		
		//1 parameter
		System.out.println("Volume Kubus : " + k2.volume());
		System.out.println("Luas Permukaan Kubus : " + k2.luasp());
		
	}

}
