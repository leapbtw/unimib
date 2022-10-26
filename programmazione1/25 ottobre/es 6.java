import java.util.*;

class main{
    public static void main(String args[]) {
		Scanner t = new Scanner(System.in);
		System.out.print("inserisci la stringa A: ");
		String stringA = t.next();
		System.out.print("inserisci la stringa B: ");
		String stringB = t.next();
		
		if (stringA.length() != 5 || stringB.length() != 5) quit();
		
		for (int i = 0; i < 5; i++)
			// se le stringhe A e B non contengono solo + e - si quitta
			if (!(stringA.charAt(i) != '+') && !(stringA.charAt(i) != '-') || !(stringB.charAt(i) != '+') && !(stringB.charAt(i) != '-'))
				quit();
		
		int a = 0, b = 4;
		for (int i = 0; i < 5; i++) {
			if (stringA.charAt(i) == '+') a++;
			else a--;
			
			if (stringB.charAt(i) == '+') b++;
			else b--;
		}
		
		System.out.println("Il valore di a e' " + a + ", il valore di b e' " + b);
		if (a == b) System.out.println("Le variabili a e b hanno assunto lo stesso valore!");
		
	}
	
	public static void quit() {
		System.out.println("Errore: le stringhe non sono simili agli esempi (+++-- e -+--+)");
		System.exit(-1);
	}
}