package PERTEMUAN6;

public class PrimaOrNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,z;
		//Bilangan Prima
		System.out.println("Bilangan Prima : ");
	    for (x=1; x<= 20; x++){
	        z=0;
	        for (y=1; y<=x; y++){
	            if (x%y==0){
	                z=z+1;
	            }
	        }
	        if (z==2){
                System.out.print(x + " ");
	        }
	    }
	    //Bilangan Non-Prima
        System.out.println("\nBilangan Non-Prima : ");
	    for (x=1; x<= 20; x++){
	        z=0;
	        for (y=1; y<=x; y++){
	            if (x%y==0){
	                z=z+1;
	            }
	        }
	        if (z==2) {
                System.out.print("");
            } else if (x != 1) {
                System.out.print(x + " ");
            }
	    }
	    
	}

}
