import java.util.*;
class main {
	public static void main(String args[]) {
		Scanner t = new Scanner(System.in);
		
		int a = 0, b = 0;
		// input a
		while (true) {
			try {
				System.out.print("inserisci a: ");
				a = Integer.parseInt(t.next());
				break;
			} catch (NumberFormatException e) {
				a = 0;
			}
		}
		// input b
		while (true) {
			try {
				System.out.print("inserisci b: ");
				b = Integer.parseInt(t.next());
				break;
			} catch (NumberFormatException e) {
				b = 0;
			}
		}
		
		try {
			System.out.println("a / b = " + a/b); // faccio la divisione
		} catch (Exception e) {		// se c'è un exception anzich'è crashare il programma....
			System.out.println("ERRORE"); // ...scrivo "ERRORE" e chiudo 
			System.exit(0);
		}
		
	}
}