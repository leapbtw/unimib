import java.util.*;
class main {
	public static void main(String args[]) {
		Scanner t = new Scanner(System.in);
		
		int a = 0, b = 0;
		boolean error = true;
		while (error) {
			try {
				System.out.print("inserisci a: ");
				a = Integer.parseInt(t.next());
				error = false;
			} catch (NumberFormatException e) {
				a = 0;
			}
		}
		error = true;
		while (error) {
			try {
				System.out.print("inserisci b: ");
				b = Integer.parseInt(t.next());
				error = false;
			} catch (NumberFormatException e) {
				b = 0;
			}
		}
		
		try {
			System.out.println("a / b = " + a/b);
		} catch (Exception e) {
			System.out.println("ERRORE");
			System.exit(0);
		}
		
	}
}