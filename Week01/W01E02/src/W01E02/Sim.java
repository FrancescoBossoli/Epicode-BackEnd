package W01E02;

public class Sim {
	private String numero;
	private double credito;
	private Chiamata[] listaChiamate;
	
	public Sim(String num) {
		this.numero = num;
		this.credito = 0;
		this.listaChiamate = new Chiamata[5];
	}
	
	public static void main(String[] args) {
		Sim a = new Sim("3882635221");
		a.listaChiamate[0] = new Chiamata(12, "3474468395");
		
		
		stampaDatiSim(a);
	}
	
	public static void stampaDatiSim(Sim a) {
		System.out.println("Il numero della Sim è: " + a.numero);
		System.out.println("Il credito della Sim è di: " + a.credito + "€");
		System.out.println("Lista delle ultime 5 chiamate effettuate:");
		if (a.listaChiamate[0] == null) {
			System.out.println("Non ci sono chiamate da visualizzare");
		}
		else {
			for (int i = 0; i < a.listaChiamate.length; i++) {
				if (a.listaChiamate[i] == null) {
					break;
				}
				System.out.println("Numero chiamato: " + a.listaChiamate[i].numeroChiamato + " - Durata della chiamata: " + a.listaChiamate[i].minuti + " minuti");
			}
		}
	}	
}

class Chiamata {
	double minuti;
	String numeroChiamato;

	public Chiamata(double m, String n) {
		this.minuti = m;
		this.numeroChiamato = n;
	}
}