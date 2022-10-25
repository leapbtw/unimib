import java.util.*;
class main {
	public static void main(String args[]) {
		Scanner t = new Scanner(System.in);
		
		String messaggio = "", stringa = "";
		System.out.print("inserisci \"messaggio\": ");
		messaggio = t.next();
		
		int posizione = 0;
		boolean error = true;
		while (error) {
			try {
				System.out.print("inserisci \"posizione\": ");
				posizione = Integer.parseInt(t.next());
				error = false;
			} catch (NumberFormatException e) {
				posizione = 0;
			}
		}
		
		System.out.print("inserisci \"stringa\": ");
		stringa = t.next();
		
		if (messaggio.equals("") || stringa.equals("")) {
			System.out.println("ERRORE stringhe vuote");
			System.exit(0);
		}
		
		if (posizione <= 0 || posizione > messaggio.length()-1) {
			System.out.println("ERRORE posizione sbagliata");
			System.exit(0);
		}
		
		System.out.println(messaggio.substring(0, posizione) + stringa + messaggio.substring(posizione, messaggio.length()));
		
	}
}