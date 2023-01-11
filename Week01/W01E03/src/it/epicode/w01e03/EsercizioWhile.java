package it.epicode.w01e03;

import java.util.Scanner;

public class EsercizioWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "";
		while (!":q".equals(s)) {
			int i = 0;
			while (i < s.length()) {
				System.out.print(s.charAt(i));
				i++;
				if (i < s.length()) System.out.print(", "); 
				else System.out.println();
			}
		System.out.println("Inserisci una stringa");
		Scanner input = new Scanner(System.in);
		s = input.nextLine();
		}
		
	}
}
