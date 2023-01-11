package it.epicode.w01e03;

public class EsercizioCondizionali {
	public static boolean pariDispari(String s) {
		if (s.length() % 2 == 0) {
			return true;
		}
		else return false;
	}
	
	public static boolean annoBisestile(int i) {
		if (i % 4 == 0) {
			return true;
		}
		else return false;
	}
	
	public static void main(String[] args) {
		System.out.println("Il numero di lettere che compongono la parola inserita è " + (pariDispari("parola") == true ? "pari" : "dispari"));
		System.out.println("Il numero di lettere che compongono la parola inserita è " + (pariDispari("prova") == true ? "pari" : "dispari"));
		System.out.println("L'anno inserito " + (annoBisestile(1996) == true ? "è" : "non è") + " bisestile");
		System.out.println("L'anno inserito " + (annoBisestile(1998) == true ? "è" : "non è") + " bisestile");
	}
}
