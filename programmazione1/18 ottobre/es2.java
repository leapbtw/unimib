import java.util.*;
class main {
	public static void main(String args[]) {
		Scanner t = new Scanner(System.in);
		
		double e = 0;
		while (true) {
			try {
				System.out.print("inserisci epsilon: ");
				e = Double.parseDouble(t.next());
			} catch (NumberFormatException ex) {
				
			}
			if (e != 0) break;
		}
		
		
		double n = 0;
		while (true) {
			double result = n/(n+1);
			if (1 - e < result && result <= 1) break;
		}
		
		System.out.println("n: " + n);
	}
}
