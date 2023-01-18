package Esercizio03;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.apache.commons.io.FileUtils;

public class RegistroPresenze {
	
	private static File filePresenze = new File("presenze/presenze.txt");

	private static HashMap<String, Integer> presenze = new HashMap<>();
	
	private static void salvaSuDisco() throws IOException {
		
		String contenuto = "";
		
		for (HashMap.Entry<String, Integer> voci : presenze.entrySet()) {
			contenuto += voci.getKey()  + "@" + voci.getValue() + "#";
		}	
		
		FileUtils.writeStringToFile(filePresenze, contenuto, "utf-8");		
	}
	
	private static void leggiDaFile() throws IOException {
		
		String[] voci = (FileUtils.readFileToString(filePresenze, "utf-8")).replace("@", " - ").split("#");
		
		System.out.println("Registro Presenze: ");
		for (int i = 0; i < voci.length; i++) {
			System.out.println(voci[i]);
		}
	}
	
	public static void main(String[] args) {
		
		presenze.put("Mario Rossi", 5);
		presenze.put("Gianni Verdi", 7);
		presenze.put("Marco Bianchi", 8);
		presenze.put("Luca Neri", 3);
		System.out.println("Presenze prima della scrittura su file: ");
		System.out.println(presenze + "\n");
		
		try {
			salvaSuDisco();
			leggiDaFile();
		} catch (IOException e) {}
	}
}
