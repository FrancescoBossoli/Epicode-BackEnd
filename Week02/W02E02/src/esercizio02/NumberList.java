package esercizio02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class NumberList {
	
	
	private static ArrayList<Integer> numeriCasuali = new ArrayList<>();
	
	private static ArrayList<Integer> listaCasuale(int n) {		
		Random r = new Random();
		for (int i = 0; i < n; i++) {
			numeriCasuali.add(r.nextInt(100));
		}
		Collections.sort(numeriCasuali);
		return numeriCasuali;
	}
	
	@SuppressWarnings("unchecked")
	private static ArrayList<Integer> listaDoppiaInversa(ArrayList<Integer> list) {
		ArrayList<Integer> clone = (ArrayList<Integer>) list.clone();
		Collections.reverse(clone);
		list.addAll(clone);
		return list;
	}
	
	private static ArrayList<Integer> stampaMetàValori(ArrayList<Integer> list, boolean b) {
		ArrayList<Integer> metà = new ArrayList<Integer>();
		for (int i = 0; i < list.size(); i++) {
			if (b==true) {
				if (i%2 == 0) metà.add(list.get(i));
			} else {
				if (i%2 != 0) metà.add(list.get(i));
			}
		}
		return metà;
	}

	public static void main(String[] args) {
		
		int numero = 0;
		Scanner input = new Scanner(System.in);
		while (numero == 0) {
			try {
				System.out.println("Quanti numeri casuali vuoi che la lista contenga?");
				numero = Integer.parseInt(input.nextLine());
				if (numero < 1) throw new Exception();
			}
			catch(NumberFormatException e) {
				System.out.println("Bisogna inserire un numero intero positivo");
			}
			catch(Exception e) {
				System.out.println("Occorre inserire un numero maggiore di 0");
			}
		}
		System.out.println("Lista ordinata dei numeri generati: ");
		System.out.println(listaCasuale(numero));
		System.out.println("Lista ordinata + lista inversa dei numeri generati: ");
		System.out.println(listaDoppiaInversa(numeriCasuali));
		System.out.println("Numeri generati di indice pari dell'ultima lista: ");
		System.out.println(stampaMetàValori(numeriCasuali, true));
		System.out.println("Numeri generati di indice dispari dell'ultima lista: ");
		System.out.println(stampaMetàValori(numeriCasuali, false));
		input.close();
		System.out.println(Collections.max(numeriCasuali));
	}
}
