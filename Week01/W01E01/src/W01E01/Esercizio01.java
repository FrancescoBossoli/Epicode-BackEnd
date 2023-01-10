package W01E01;

public class Esercizio01 {

	public static void main(String[] args) {
		System.out.println(moltiplica(3,5));
		System.out.println(concatena("stringa",4));
		String[] array = {"a","b","d","e","f"};
		System.out.println(inserisciInArray(array,"c")[0] + " " + inserisciInArray(array,"c")[1] + " " + inserisciInArray(array,"c")[2] + " " + inserisciInArray(array,"c")[3] + " " + inserisciInArray(array,"c")[4] + " " + inserisciInArray(array,"c")[5]);
	}
	public static int moltiplica(int a, int b) {
		return a * b;
	}
	public static String concatena(String a, int b) {
		return a + b;
	}
	public static String[] inserisciInArray(String[] a, String b) {
		String[] newArray = {"","","","","",""};
		newArray[0] = a[0];
		newArray[1] = a[1];
		newArray[2] = b;
		newArray[3] = a[2];
		newArray[4] = a[3];
		newArray[5] = a[4];
		return newArray;
	}
}