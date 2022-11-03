import java.util.*;
class main {
	public static void main(String args[]) {
		Scanner t = new Scanner(System.in);
		System.out.print("inserisci il primo nome: ");
		String player1 = t.next();
		System.out.print("inserisci il secondo nome: ");
		String player2 = t.next();
		
		for (;;) {
			System.out.print("" + player1 + " gioca per primo, inserisci 'sasso', 'carta' o 'forbici': ");
			String giocata1 = "";
			while (!giocata1.equals("sasso") && !giocata1.equals("carta") && !giocata1.equals("forbici")) giocata1 = t.next();
			
			System.out.print("" + player2 + " gioca per secondo, inserisci 'sasso', 'carta' o 'forbici': ");
			String giocata2 = "";
			while (!giocata2.equals("sasso") && !giocata2.equals("carta") && !giocata2.equals("forbici")) giocata2 = t.next();
			
			System.out.println(player1 + " ha giocato " + giocata1);
			System.out.println(player2 + " ha giocato " + giocata2);
			
			if (giocata1.equals(giocata2)) System.out.println("la giocata e' pari: PARITA'");
			else if (giocata1.equals("sasso") && giocata2.equals("forbici")) System.out.println("" + player1 + " vince");
			else if (giocata2.equals("sasso") && giocata1.equals("forbici")) System.out.println("" + player2 + " vince");
			else if (giocata1.equals("forbici") && giocata2.equals("carta")) System.out.println("" + player1 + " vince");
			else if (giocata2.equals("forbici") && giocata1.equals("carta")) System.out.println("" + player2 + " vince");
			else if (giocata1.equals("carta") && giocata2.equals("sasso")) System.out.println("" + player1 + " vince");
			else if (giocata2.equals("carta") && giocata1.equals("sasso")) System.out.println("" + player2 + " vince");
			
			System.out.println("\nvuoi continuare a giocare? [si/no]");
			String continua = t.next();
			if (!continua.equals("si")) break;
		}
		
		System.out.println("fine gioco");
	}
}