package esercizio01;
import java.util.HashSet;
import java.util.Scanner;

public class WordSet {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		HashSet<String> parole = new HashSet<>();
		HashSet<String> duplicati = new HashSet<>();
		int numero = 0;
		while (numero == 0) {
			try {
				System.out.println("Inserisci il numero di parole da inserire in lista");
				numero = Integer.parseInt(input.nextLine());
				if (numero < 1) throw new Exception();
			}
			catch(NumberFormatException e) {
				System.out.println("Non è stato inserito un numero intero");
			}
			catch(Exception e) {
				System.out.println("Occorre inserire un numero maggiore di 0");
			}
		}
		
		for (int i = 0; i < numero; i++) {
			System.out.println("Inserisci la parola n°" + (i+1));
			String parola = input.nextLine();
			if (parole.contains(parola)) {
				duplicati.add(parola);
			}
			parole.add(parola);
		}
		
		System.out.println("Le parole duplicate sono: " + duplicati.toString());
		System.out.printf("Le parole distinte sono %d: %s", parole.size(), parole.toString());
		input.close();
	}

}
