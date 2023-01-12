package it.epicode.w01e04;

public class Dipendente {

	public static double stipendioBase = 1000;
	private String matricola;
	private double stipendio;
	private double importoOrarioStraordinario;
	private Livello livello;
	private Dipartimento dipartimento;
	
	public String getMatricola() {
		return matricola;
	}
	public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
		this.importoOrarioStraordinario = importoOrarioStraordinario;
	}
	public void setDipartimento(Dipartimento dipartimento) {
		this.dipartimento = dipartimento;
	}
	public double getStipendio() {
		return stipendio;
	}
	public double getImportoOrarioStraordinario() {
		return importoOrarioStraordinario;
	}
	public Livello getLivello() {
		return livello;
	}
	public Dipartimento getDipartimento() {
		return dipartimento;
	}
	
	public Dipendente(String _matricola, Dipartimento _dipartimento) {
		this.matricola = _matricola;
		this.stipendio = stipendioBase;
		this.importoOrarioStraordinario= 30;
		this.livello = Livello.OPERAIO;
		this.dipartimento = _dipartimento;
	}
	
	public Dipendente(String _matricola, double _stipendio, double _importoOrarioStraordinario, Livello _livello, Dipartimento _dipartimento) {
		this(_matricola, _dipartimento);
		this.stipendio = _stipendio;
		this.importoOrarioStraordinario= _importoOrarioStraordinario;
		this.livello = _livello; 
	}
	
	public void stampaDatiDipendente() {
		System.out.printf("Dati Dipendente %n Matricola: %s%n Stipendio: %.2f%n Importo Orario Straordinario: %.2f%n Livello: %s%n Dipartimento: %s%n", this.matricola, this.stipendio, this.importoOrarioStraordinario, this.livello, this.dipartimento);
	}
	
	public Livello promuovi() {
		switch(this.livello) {
			case OPERAIO : 
				this.livello = Livello.IMPIEGATO;
				this.stipendio = stipendioBase * 1.2;
				return this.livello;
			case IMPIEGATO :
				this.livello = Livello.QUADRO;
				this.stipendio = stipendioBase * 1.5;
				return this.livello;
			case QUADRO :
				this.livello = Livello.DIRIGENTE;
				this.stipendio = stipendioBase * 2;
				return this.livello;
			case DIRIGENTE :
				System.out.println("Non è possibile promuovere ulteriormente il dipendente");
		}
		return livello;
	}
	
	public static double calcolaPaga(Dipendente a) {
		return a.stipendio;
	}
	
	public static double calcolaPaga(Dipendente a, int ore) {
		return a.stipendio + (a.importoOrarioStraordinario * ore);
	}
}
