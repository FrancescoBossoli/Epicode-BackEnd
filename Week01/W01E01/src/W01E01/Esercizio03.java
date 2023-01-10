package W01E01;

import java.util.Scanner;

public class Esercizio03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci il valore della base del rettangolo in cm:");
		double a = in.nextDouble();
		System.out.println("Inserisci il valore dell'altezza del rettangolo in cm:");
		double b = in.nextDouble();
		System.out.println("Il perimetro del rettangolo è di " + perimetroRettangolo(a, b) + " cm");
		System.out.println("Inserisci un numero intero");
		int c = in.nextInt();
		System.out.println("Il numero inserito è " + (pariDisari(c) == 0 ? "pari" : "dispari"));
		System.out.println("Inserisci il valore del primo lato di un triangolo in cm:");
		double d = in.nextDouble();
		System.out.println("Inserisci il valore del secondo lato di un triangolo in cm:");
		double e = in.nextDouble();
		System.out.println("Inserisci il valore del terzo lato di un triangolo in cm:");
		double f = in.nextDouble();
		System.out.println("L'area del triangolo è di " + areaTriangolo(d,e,f) + " cm");
		in.close();
	}
	public static double perimetroRettangolo(double a, double b) {
		return (a+b)*2;
	}
	public static int pariDisari(int a) {
		return a%2 == 0 ? 0 : 1;
	}
	public static double areaTriangolo(double a, double b, double c) {
		return Math.sqrt(((a+b+c)/2)*(((a+b+c)/2)-a)*(((a+b+c)/2)-b)*(((a+b+c)/2)-c));
	}
}
