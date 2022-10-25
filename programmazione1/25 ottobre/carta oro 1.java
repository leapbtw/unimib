import java.util.*;
class main {
	public static void main(String args[]) {
		Scanner t = new Scanner(System.in);
		
		String stringa = "";
		System.out.print("inserisci \"la somma algebrica da effettuare\": "); // input operazione es. "-100+30-20+10"
		
		stringa = t.next() + "+"; 
		// il + è aggiunto per fixare (in modo brutto) un bug che non avevo voglia di risolvere
		// praticamente l'ultima operazione viene saltata se non c'è un + alla fine della stringa di input
		

		int somma = 0, temp = 0; // somma contiene il risultato finale, temp contiene il numero che sta venendo estratto dalla stringa di input
		char tempChar = 0
		boolean inverti = false; // se c'è una sottrazione, diventa true (guarda sotto)
		for (int i = 0; i < stringa.length(); i++) {
			
			tempChar = stringa.charAt(i);	// scorro la stringa col for e prendo un carattere
			
			/**
			* prendendo una cifra da una stringa (ASCII) e facendo -48 ottengo un int pari al valore della cifra
			* es:   la cifra 1 nella tabella ascii (https://asciitable.com/) vale 49, facendo 49 -48 ottengo 1
			*		funziona con tutte le cifre
			*/
			
			
			// faccio spesso casting da (char) ad (int) per fare le operazioni: FORSE non è necessario ma sicuramente funziona
			if (i == 0 && ((int) tempChar-48 == -3))	// in ascii, il segno meno vale 45, che -48 fa -3. Qui ci entro se trovo un segno meno
				inverti = true;		// se trovo un meno, mi segno che prima di sommare il numero lo devo moltiplicare per -1
			
			
			// qui "costruisco" il numero cifra per cifra (grazie simo)
			// in sostanza, se ho "123", al primo giro del FOR prendo la cifra 1
			// subito dopo la moltiplico per 10 e aggiungo il 2, ho 12
			// moltiplico di nuovo per 10 e aggiungo il 3, ho 123
			if ((int) tempChar-48 >= 0)
				temp = (temp*10) + tempChar-48;
			
			
			// qui ci entro solamente se stringa.charAt(i) risulta negativo (e quindi ho trovato un + (-5) o un - (-3) 
			else {
				if (inverti == true && i != 0) { // se devo invertire inverto
					temp *= -1;
					inverti = false; // e resetto il flag per il prossimo numero che trovo
				}
				
				if ((int) tempChar-48 == -3) inverti = true; // se trovo un - mi ricordo di invertire al prossimo giro del for
				
				somma += temp;	// faccio la somma (qui probabilmente ci sta il bug di prima, ma amen è "fixato")
				temp = 0;
			}
		}
		somma += temp; // altro piccolo fix per il bug (e' tutto un po' fatto a caso, si può sicuramente fare meglio)
		System.out.println("somma finale: " + somma);
		
	}
}