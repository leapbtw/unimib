import java.util.*;

class main{
    public static void main(String args[]){
        String s = "", S = "";
		Scanner t = new Scanner(System.in);
		System.out.print("inserisci la prima parola: ");
		s = t.next();
		System.out.print("inserisci la seconda parola: ");
		S = t.next();
	
		for (int i = 0; i < s.length(); i++) 
			if (!(s.charAt(i) >= 97) || !(s.charAt(i) <= 122)) quit();
		for (int i = 0; i < S.length(); i++) 
			if (!(S.charAt(i) >= 65) || !(S.charAt(i) <= 90)) quit();
		
		
		for (int i = 0; i < s.length(); i++)
			for (int j = 0; j < S.length(); j++)
				System.out.println("permutazione #" + (((i*S.length())+j)+1) + ":\t" + s.charAt(i) + S.charAt(j));
	}
	
	public static void quit() {
		System.out.println("errore: la stringa non va bene");
		System.exit(-1);
	}
}