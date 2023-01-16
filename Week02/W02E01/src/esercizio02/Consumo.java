package esercizio02;

import java.util.Scanner;

public class Consumo {

	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) throws FuelException{
		double km = 0, litri = -1, calcolo = 0;
		try {
			System.out.println("Quanti kilometri sono stati percorsi dall'ultimo rifornimento?");
			km = Double.parseDouble(Consumo.input.nextLine());
			System.out.println("Quanti litri sono stati consumati?");
			litri = Double.parseDouble(Consumo.input.nextLine());
			calcolo = km/litri;
		}		
		catch(NumberFormatException e) {
			System.out.println("Non è stato inserito un numero come richiesto");
		}
		try {
			if (litri <= 0) {
				throw new FuelException();			
			}
			else {
				System.out.println("Con un litro di benzina sei riuscito a fare " + calcolo + " kilometri");
			}
		}
		catch(FuelException e) {
			System.out.println("Non è possibile che non sia stato consumato carburante");
		}
		
	}
}
