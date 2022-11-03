import java.util.*;
class main {
	public static void main(String args[]) {
		Scanner t = new Scanner(System.in);
		System.out.print("inserisci una frase composta da una o piu' parole: ");
		String frase = t.nextLine() + " ";
		String ultima = "";
		
		if (frase.equals(" ")) {
			System.out.println("la frase non contiene parole");
			System.exit(-1);
		}
		int index = 0;
		boolean trovataPrima = false;
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == ' ') {
				if (!trovataPrima) System.out.println("prima parola: " + frase.substring(index, i) + "\tlunghezza: " + frase.substring(index, i).length());
				else ultima = frase.substring(index+1, i);
				
				trovataPrima = true;
				
				index = frase.substring(0, i).length();
			}
		}
		
		if (ultima.equals("")) System.out.println("la frase contiene solo una parola");
		else System.out.println("ultima parola: " + ultima + "\tlunghezza: " + ultima.length());
	}
}