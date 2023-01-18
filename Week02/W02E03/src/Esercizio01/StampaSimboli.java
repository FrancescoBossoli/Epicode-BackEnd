package Esercizio01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StampaSimboli extends Thread {
	
	private static final Logger logger = LoggerFactory.getLogger(StampaSimboli.class);
	
	private String symbol;
	
	public StampaSimboli(String x) {
		this.symbol = x;
	}
	
	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				logger.info(this.symbol);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {}
	}

	public static void main(String[] args) {
		
		StampaSimboli a = new StampaSimboli("*");
		StampaSimboli b = new StampaSimboli("#");
		
		logger.info("Stampa Simultanea");
		a.start();
		b.start();
		
//		logger.info("Stampa in Sequenza");
//		try {
//			a.start();
//			a.join();
//			b.start();	
//		} catch (InterruptedException e) {}				
	}
}
