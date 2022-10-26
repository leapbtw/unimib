import java.util.*;

class main{
    public static void main(String args[]){
		Scanner t = new Scanner(System.in);
		System.out.print("inserisci un numero di quattro cifre: ");
		String s = t.next(); // input
		int risultato = 0;
		
		if (s.length() < 4 || s.length() > 4) {	// se non è lunga 4 quitto
			System.out.println("La stringa non e' di 4 caratteri!");
			quit();
		}
		
		// scorro la stringa
		for (int i = 0; i < s.length(); i++) {
			
			char tempChar = s.charAt(i); // prendo un carattere
			
			if (!(tempChar >= 48) || !(tempChar <= 57)) {
				System.out.println("La stringa contiene caratteri non validi!");
				quit();
			}
			
			if ((int) tempChar-48 >= 0)
				risultato = (risultato*10) + tempChar-48; // lo converto in int (guarda carta oro 1)
		}
		
		System.out.println("risultato:\t" + risultato);
	}
	
	public static void quit() {
		System.exit(-1);
	}
}