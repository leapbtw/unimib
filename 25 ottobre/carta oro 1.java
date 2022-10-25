import java.util.*;
class main {
	public static void main(String args[]) {
		Scanner t = new Scanner(System.in);
		
		String stringa = "";
		System.out.print("inserisci \"la somma algebrica da effettuare\": ");
		stringa = t.next() + "+";
		// -100+30-20+10
		
		int somma = 0, temp = 0;
		char tempChar = 0;
		boolean inverti = false;
		for (int i = 0; i < stringa.length(); i++) {
			
			tempChar = stringa.charAt(i);
			
			if (i == 0 && ((int) tempChar-48 == -3))
				inverti = true;
			
			if ((int) tempChar-48 >= 0) {
				temp = (temp*10) + tempChar-48;
				//System.out.println(temp);
			}
			
			else {
				if (inverti == true && i != 0) {
					temp *= -1;
					inverti = false;
				}
				
				if ((int) tempChar-48 == -3) inverti = true;
				
				somma += temp;
				temp = 0;
			}
		}
		somma += temp;
		System.out.println("somma finale: " + somma);
		
	}
}