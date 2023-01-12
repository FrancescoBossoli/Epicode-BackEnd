package it.epicode.w01e04;

public class GestioneDipendenti {

	public static void main(String[] args) {
		
		Dipendente a1 = new Dipendente("D032535", 1300, 30, Livello.OPERAIO, Dipartimento.PRODUZIONE);
		Dipendente a2 = new Dipendente("S032421", 1200, 30, Livello.OPERAIO, Dipartimento.PRODUZIONE);
		Dipendente a3 = new Dipendente("Q002455", 1800, 30, Livello.IMPIEGATO, Dipartimento.AMMINISTRAZIONE);
		Dipendente a4 = new Dipendente("V016948", 2500, 30, Livello.DIRIGENTE, Dipartimento.VENDITE);
		Dipendente[] dipendenti = {a1, a2, a3, a4};
		
		a2.promuovi();
		a3.promuovi();
		
		double totale = 0;
		for (Dipendente a: dipendenti) {
			a.stampaDatiDipendente();
			totale += Dipendente.calcolaPaga(a, 5);
		}	
		
		System.out.printf("Totale complessivo degli stipendi dovuti: %.2f €", totale);
		
	}

}
