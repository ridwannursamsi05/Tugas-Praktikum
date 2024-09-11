package PERTEMUAN2;

public class KonstruktorLoop {
	    public KonstruktorLoop() { //using parameter for loop
	        standar("There was a farmer who had a dog,\nAnd Bingo was his name-o.\n");
	        ngulang("B-I-N-G-O\n", 3);
	        standar("And Bingo was his name-o.\n\n");

	        standar("There was a farmer who had a dog,\nAnd Bingo was his name-o.\n");
	        ngulang("(clap)-I-N-G-O\n", 3);
	        standar("And Bingo was his name-o.\n\n");

	        standar("There was a farmer who had a dog,\nAnd Bingo was his name-o.\n");
	        ngulang("(clap)-(clap)-N-G-O\n", 3);
	        standar("And Bingo was his name-o.\n\n");

	        standar("There was a farmer who had a dog,\nAnd Bingo was his name-o.\n");
	        ngulang("(clap)-(clap)-(clap)-G-O\n", 3);
	        standar("And Bingo was his name-o.\n\n");

	        standar("There was a farmer who had a dog,\nAnd Bingo was his name-o.\n");
	        ngulang("(clap)-(clap)-(clap)-(clap)-O\n", 3);
	        standar("And Bingo was his name-o.\n\n");

	        standar("There was a farmer who had a dog,\nAnd Bingo was his name-o.\n");
	        ngulang("(clap)-(clap)-(clap)-(clap)-(clap)\n", 3);
	        standar("And Bingo was his name-o.\n\n");
	    }

	    public void standar(String standar) {
	        System.out.print(standar);
	    }

	    // Looping
	    public void ngulang(String print, int ngulang) {
	        for (int i = 0; i < ngulang; i++) {
	            System.out.print(print);
	        }
	    }
}
