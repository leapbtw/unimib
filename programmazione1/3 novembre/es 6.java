import java.util.*;

class main {
	public static void main(String args[]) {
		Scanner t = new Scanner(System.in);
		String menu =     "\n\nCALCOLATRICE"
						+ "\ninserire una delle seguenti operazioni:"
						+ "\n+ per sommare"
						+ "\n- per sottrarre"
						+ "\n* per moltiplicare"
						+ "\n/ per dividere"
						+ "\nu per uscire dal programma";
		boolean quit = false;
		double n1 = 0, n2 = 0;
		
		while (!quit) {
			System.out.println(menu);
			System.out.print("scelta: ");
			String scelta = t.next();
			switch (scelta) {
				case "+":
					System.out.print("inserisci n1: ");
					n1 = t.nextInt();
					System.out.print("inserisci n2: ");
					n2 = t.nextInt();
					System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
					break;
				case "-":
					System.out.print("inserisci n1: ");
					n1 = t.nextInt();
					System.out.print("inserisci n2: ");
					n2 = t.nextInt();
					System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
					break;
				case "*":
					System.out.print("inserisci n1: ");
					n1 = t.nextInt();
					System.out.print("inserisci n2: ");
					n2 = t.nextInt();
					System.out.println(n1 + " * " + n2 + " = " + (n1*n2));
					break;
				case "/":
					System.out.print("inserisci n1: ");
					n1 = t.nextInt();
					System.out.print("inserisci n2: ");
					n2 = t.nextInt();
					if (n2 == 0) System.out.println("ERRORE: non puoi dividere per zero");
					else System.out.println(n1 + " / " + n2 + " = " + (n1/n2));
					break;
				
				case "u":
					System.out.println("Arrivederci");
					quit = true;
				
				default:
					System.out.println("inserire sola una delle opzioni del menu");
			}
		}
	}
}