import java.util.*;
class main {
	public static void main(String args[]) {
		Scanner t = new Scanner(System.in);
		
		int n = 0;
		while (n == 0) {
			try {
				System.out.print("inserisci un numero di cui fare il valore assoluto: ");
				n = Integer.parseInt(t.next());
			} catch (NumberFormatException e) {
				n = 0;
			}
		}
		
		System.out.println("valore assoluto di n: " + Math.abs(n));
		
	}
}