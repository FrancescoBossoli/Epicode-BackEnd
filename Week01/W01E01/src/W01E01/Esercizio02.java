package W01E01;


import java.util.Scanner;

public class Esercizio02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci una stringa:");
		String a = in.nextLine();
		System.out.println("Inserisci una stringa:");
		String b = in.nextLine();
		System.out.println("Inserisci una stringa:");
		String c = in.nextLine();
		System.out.println(a + " " + b + " " + c);
		System.out.println(c + " " + b + " " + a);
		in.close();
	}
}