package W01E02;

public class Rettangolo {
	double larghezza;
	double altezza;
	public static void main(String[] args) {
		Rettangolo a = new Rettangolo(12.5, 20.2);
		Rettangolo b = new Rettangolo(10, 16.5);
		stampaRettangolo(a);
		stampaDueRettangoli(a,b);
	}
	public Rettangolo (double a, double l) {
		this.larghezza = l;
		this.altezza = a;
	}
	public static void stampaRettangolo(Rettangolo a) {
		System.out.println("L'area del rettangolo è di " + a.larghezza*a.altezza + " cm");
		System.out.println("Il perimetro del rettangolo è di " + (a.larghezza+a.altezza)*2 + " cm");
	}
	public static void stampaDueRettangoli(Rettangolo a, Rettangolo b) {
		System.out.println("Rettangolo 1:");
		stampaRettangolo(a);
		System.out.println("Rettangolo 2:");
		stampaRettangolo(b);
		System.out.println("La somma delle loro aree è di " + (a.larghezza*a.altezza+b.larghezza*b.altezza) + " cm");
		System.out.println("La somma dei loro perimetri è di " + (a.larghezza+a.altezza+b.larghezza+b.altezza)*2 + " cm");
	}
}
