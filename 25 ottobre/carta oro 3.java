import java.util.*;

class main{
    public static void main(String args[]){
		Scanner t = new Scanner(System.in);
		System.out.print("inserisci la parola: ");
		String s = t.next();
		int m = 0, n = 0, k = s.length();
		
		// controllo che la stringa inserita sia composta solo da lettere minuscole
		for (int i = 0; i < s.length(); i++) 
			if (!(s.charAt(i) >= 97) || !(s.charAt(i) <= 122)) quit();
		
		// input M
		while (m < 1 || m > k) {
			try {
				System.out.print("inserisci M: ");
				m = Integer.parseInt(t.next());
			} catch (NumberFormatException e) {
				quit();
			}
		}
		
		// input N
		while (n < 1 || n > k) {
			try {
				System.out.print("inserisci N: ");
				n = Integer.parseInt(t.next());
			} catch (NumberFormatException e) {
				quit();
			}
		}
		
		// posizione m		
		s = s.substring(0, m-1) + (char) (s.charAt(m-1)-32) + s.substring(m); //(m-1) perché gli array partono da zero
		int x = 1;
		while (true) { 						// -32 per trasformare in maiuscola
			int pos = (m-1 + x*n) % k;		// pos da modificare
			x++;
			if (s.charAt(pos) < 97) break;	// se s.charAt(pos) è gia maiuscolo esco dal ciclo
			s = s.substring(0, pos) + (char) (s.charAt(pos)-32) + s.substring(pos+1);		// modifico la stringa
			System.out.println("pos: " + pos + "\ts:" + s + "\tcharAt:" + s.charAt(pos));	// output di debug, commentabile
		}
		System.out.println("risultato: " + s + "");
	}
	
	public static void quit() {
		System.out.println("errore: la stringa non va bene");
		System.exit(-1);
	}
}