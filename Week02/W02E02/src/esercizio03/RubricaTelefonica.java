package esercizio03;

import java.util.HashMap;
import java.util.Map.Entry;

public class RubricaTelefonica {

	private static HashMap<String,String> rubrica = new HashMap<String,String>();
	
	private static void inserisciVoce(String nome, String numero) {
		rubrica.put(nome, numero);
	}
	
	private static void cancellaVoce(String nome) {
		if (rubrica.containsKey(nome)) {
			rubrica.remove(nome);
			System.out.println("Il contatto di " + nome + " è stato cancellato");
		} else {
			System.out.println("La rubrica non contiene il nome indicato");
		}		
	}
	
	private static void ricercaVoceConNumero(String numero) {
		if (rubrica.containsValue(numero)) {
			rubrica.get(numero);
			for (Entry<String, String> entry : rubrica.entrySet()) {
				if (entry.getValue().equals(numero)) {
					System.out.println("Il numero " + numero + " appartiene a " + entry.getKey());;
				}
			}
		} else {
			System.out.println("La rubrica non contiene il numero indicato");
		}		
	}
	
	private static void ricercaVoceConNome(String nome) {
		if (rubrica.containsKey(nome)) {
			System.out.println("Il numero di " + nome + " è: " + rubrica.get(nome));
		} else {
			System.out.println("La rubrica non contiene il nome indicato");
		}		
	}
	
	public static void main(String[] args) {

		inserisciVoce("Tizio", "3881258695");
		inserisciVoce("Caio", "3404826593");
		inserisciVoce("Sempronio", "3275894117");
		ricercaVoceConNumero("3404826593");
		ricercaVoceConNome("Tizio");
		cancellaVoce("Sempronio");
		
	}

}
