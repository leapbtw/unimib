import java.util.*;
class main {
	public static void main(String args[]) {
		Scanner t = new Scanner(System.in);
		
		String messaggio = "", stringa = "";
		System.out.print("inserisci \"messaggio\": ");
		messaggio = t.next();
		
		int posizione = -1;
		while (posizione < 0) {
			try {
				System.out.print("inserisci \"posizione\": ");
				posizione = Integer.parseInt(t.next());
			} catch (NumberFormatException e) {
				posizione = -1;
			}
		}
		
		System.out.print("inserisci \"stringa\": ");
		stringa = t.next();
		
		if (messaggio.equals("") || stringa.equals("")) { // se son vuote lo dico
			System.out.println("ERRORE stringhe vuote");
			System.exit(0);
		}
		
		if (posizione <= 0 || posizione > messaggio.length()-1) { // se la pos è sbagliata lo dico
			System.out.println("ERRORE posizione sbagliata");
			System.exit(0);
		}
		
		// output
		System.out.println(messaggio.substring(0, posizione) + stringa + messaggio.substring(posizione, messaggio.length()));
		
	}
}