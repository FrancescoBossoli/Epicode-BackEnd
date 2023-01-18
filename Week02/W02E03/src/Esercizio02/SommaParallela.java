package Esercizio02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SommaParallela extends Thread {
	
	private static List<Integer> numeri = new ArrayList<>();
	private static final Logger logger = LoggerFactory.getLogger(SommaParallela.class);
	private int start = 0;
	private int somma = 0;
	
	private SommaParallela(int x) {
		this.start = x;
	}
	
	private static void generaNumeri() {		
		Random r = new Random();
		for (int i = 0; i < 3000; i++) {			
			numeri.add(r.nextInt(101));
		}
	}
	
	@Override
	public void run() {
		for (int i = this.start; i < this.start+1000; i++) {
			this.somma += numeri.get(i);
		}
		logger.info("\nSomma n°" + ((this.start/1000)+1) + ": " + Integer.toString(this.somma) + "\n");
	}	

	public static void main(String[] args) {		
		SommaParallela s1 = new SommaParallela(0);
		SommaParallela s2 = new SommaParallela(1000);
		SommaParallela s3 = new SommaParallela(2000);
		generaNumeri();
		System.out.println(numeri.subList(0,1000));
		System.out.println(numeri.subList(1000,2000));
		System.out.println(numeri.subList(2000,3000) + "\n");
		
		
		try {
			s1.start();
			s2.start();
			s3.start();

			s1.join();
			s2.join();
			s3.join();
			logger.info("\nSomma totale : \n" + Integer.toString(s1.somma+s2.somma+s3.somma));
		} catch (InterruptedException e) {}
	}
}
