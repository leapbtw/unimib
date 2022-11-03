import java.util.*;
class main {
	public static void main(String args[]) {
		Scanner t = new Scanner(System.in);
		System.out.print("inserisci il voto di teoria [-8 / 8]: ");
		int teoria = t.nextInt();
		System.out.print("il voto di pratica [0 / 24]: ");
		int pratica = t.nextInt();
		
		int risultato = pratica + teoria;
		
		if (risultato >= 18 && teoria < 1) System.out.println("Bocciato, devi studiare piu' teoria");
		else if (pratica < 18 && teoria < 1) System.out.println("Bocciato, devi studiare ed esercitarti di piu'");
		else if (teoria > 0 && risultato < 18) System.out.println("Bocciato, devi esercitarti di piu'");
		else if (risultato == 31 || risultato == 32) System.out.println("Congraturazioni, 30 e Lode!");
		else System.out.println("Il tuo voto e' " + risultato);
	}
}