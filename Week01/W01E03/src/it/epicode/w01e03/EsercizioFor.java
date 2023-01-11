package it.epicode.w01e03;

import java.util.Scanner;

public class EsercizioFor {

	public static void main(String[] args) {
		System.out.println("Inserisci un numero intero");
		Scanner input = new Scanner(System.in);		
		int number = (input.nextInt());
		System.out.println("Contdown:");
		for (int i = 0; i < number; i++) {
			System.out.println(number-i);
		}
	}
}
