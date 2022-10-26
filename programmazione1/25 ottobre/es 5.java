import java.util.*;

class main{
    public static void main(String args[]){
		Scanner t = new Scanner(System.in);
		
		int n = -1;
		while (true) {
			try {
				System.out.print("inserisci n: ");
				n = Integer.parseInt(t.next());
				break;
			} catch (NumberFormatException e) {
				n = -1;
			}
		}
		
		if (n < 0 || n > 127) 
			quit();
		
		String risultato = "";
		for (int i = 0; i < 7; i++) {
			if (n % 2 == 1) risultato = "1" + risultato;
			else risultato = "0" + risultato;
			n /= 2;
		}
		System.out.println("risultato:\t" + risultato);
		
	}
	
	public static void quit() {
		System.out.println("Errore: il numero inserito deve essere compreso tra 0 e 127!");
		System.exit(-1);
	}
}