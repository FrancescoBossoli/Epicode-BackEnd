package esercizio01;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean loop = true;
		int a = 0, b = 0;
		int[] array = {(int)(Math.random() * 10)+1,(int)(Math.random() * 10)+1,(int)(Math.random() * 10)+1,(int)(Math.random() * 10)+1,(int)(Math.random() * 10)+1};
		System.out.println(Arrays.toString(array));
		while(loop == true) {
			try {
				System.out.println("Inserisci un numero tra 1 e 10");
				a = Integer.parseInt(Main.input.nextLine());
			}
			catch(NumberFormatException e) {
				System.out.println("Non è stato inserito un numero intero");
				continue;
			}
			if (a < 0 || a > 10) {
				System.out.println("Il numero inserito non appartiene all'intervallo richiesto");
			}
			else if (a == 0) {
				loop = false;
				input.close();
			}
			else {				
				try {
					System.out.println("Quale posizione assegnare al numero scelto? Esprimi la preferenza con un numero da 1 a 5");
					b = Integer.parseInt(Main.input.nextLine());
					array[b-1] = a;
					System.out.println(Arrays.toString(array));
				}
				catch(NumberFormatException e) {
					System.out.println("Non è stato inserito un numero intero");
				}
				catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("Il numero inserito non appartiene all'intervallo richiesto");
				}
				
					
				
				
					
				
			}			
		}
		
		
	}

}
