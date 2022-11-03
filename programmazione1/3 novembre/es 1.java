import java.util.*;
class main {
	public static void main(String args[]) {
		Scanner t = new Scanner(System.in);
		
		int mese = 0, anno = 0;
		
		System.out.print("inserisci un numero tra 1 e 12 per indicare un mese dell'anno: ");
		try {
			mese = t.nextInt();
		} catch (Exception e) {}
		if (mese < 1 && mese > 12) {
			System.out.println("ERRORE: il mese deve essere compreso tra 1 e 12");
			System.exit(-1);
		}
		
		System.out.print("inserisci un anno: ");
		try {
			anno = t.nextInt();
		} catch (Exception e) {}
		if (anno < 1900 && anno > 2099) {
			System.out.println("ERRORE: l'anno deve essere compreso tra 1900 e 2099");
			System.exit(-1);
		}
		
		if (mese == 1 || mese == 3 || mese == 5 || mese == 7 || mese == 8 || mese == 10 || mese == 12)
			System.out.println("il mese e' composto da 30 giorni");
		else if (mese == 2)
			if ((anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0))
				System.out.println("il mese e' composto da 29 giorni");
			else System.out.println("il mese e' composto da 28 giorni");
		else System.out.println("il mese e' composto da 31 giorni");
		
	}
}