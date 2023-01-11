package it.epicode.w03e01;

import java.util.Scanner;

public class EsercizioSwitch {
	
	public static String stampa(int i) {
		switch (i) {
			case 0: 
				return "zero";
			case 1: 
				return "uno";
			case 2: 
				return "due";
			case 3: 
				return "tre";
			default:
				return "Il numero inserito non è compreso tra 0 e 3";
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inserisci un numero intero");
		Scanner input = new Scanner(System.in);
		System.out.println(stampa(input.nextInt()));		
	}
}
