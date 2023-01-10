package W01E02;

import java.time.LocalDate;

public class Store {
	private class Articolo {
		private String codice;
		private String descrizioneArticolo;
		private double prezzo;
		private int numeroPezzi;
		
		public Articolo(String cod, String descrizione, double prezzo) {
			this.codice =cod;
			this.descrizioneArticolo = descrizione;
			this.prezzo = prezzo;
			this.numeroPezzi = 1;
		}
		
		public Articolo(String cod, String descrizione, double prezzo, int amount) {
			this.codice =cod;
			this.descrizioneArticolo = descrizione;
			this.prezzo = prezzo;
			this.numeroPezzi = amount;
		}
	}
	
	private class Cliente {
		private String codice;
		private String nome;
		private String cognome;
		private String email;
		private LocalDate dataIscrizione;
		
		public Cliente(String cod, String nome, String cognome, String email) {
			this.codice = cod;
			this.nome = nome;
			this.cognome = cognome;
			this.email = email;
			this.dataIscrizione = LocalDate.now();
		}
	}
	
	private class Carrello {
		private Cliente clienteAssociato;
		private Articolo[] elencoArticoli;
		private double totaleCostoArticoli;
		{
			for (int i = 0; i < elencoArticoli.length; i++) {
				this.totaleCostoArticoli += elencoArticoli[i].prezzo*elencoArticoli[i].numeroPezzi;
			}
		}
		
		public Carrello(Cliente User) {
			this.clienteAssociato = User;
			this.elencoArticoli = new Articolo[1];
			this.totaleCostoArticoli = 0;
		}
		
		public void aggiungiArticolo(Articolo a, int numeroPezzi) {
			if (this.elencoArticoli[0] == null) {
				this.elencoArticoli[0] = a;
				this.elencoArticoli[0].numeroPezzi = numeroPezzi;
				this.totaleCostoArticoli = elencoArticoli[0].prezzo*elencoArticoli[0].numeroPezzi;
			}
			else {
				Articolo[] nuovoElenco = new Articolo[(this.elencoArticoli.length + 1)];
				for (int i = 0; i < elencoArticoli.length; i++) {
					nuovoElenco[i] = this.elencoArticoli[i];					
				}
				a.numeroPezzi = numeroPezzi;
				nuovoElenco[nuovoElenco.length - 1] = a;
				this.totaleCostoArticoli += a.prezzo*a.numeroPezzi;
			}
		}
	}
}