import java.util.*;
class main {
	public static void main(String args[]) {
		Scanner t = new Scanner(System.in);
		
		int n = 0; // n di An

		// input di n da tastiera
		while (n < 1) {
			try {
				System.out.print("inserisci un numero naturale maggiore di zero: ");
				n = Integer.parseInt(t.next());
			} catch (NumberFormatException e) {
				n = 0;
			}
		}
		
		int An = 2;
		// calcolo la successione 
		for (int i = 0; i < n; i++) {
			System.out.println(3*An-2);
			An = 3*An-2;
		}
	}
}
