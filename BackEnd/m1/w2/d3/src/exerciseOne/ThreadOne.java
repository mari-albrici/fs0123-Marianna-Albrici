package exerciseOne;

public class ThreadOne extends Thread {
	
	private String string;
	
	public ThreadOne(String string) {
		this.string = string;
	}

	@Override
	public void run() { 
		for (int i = 0; i < 10; i++) {
			Main.logger.info(string + (i + 1));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				Main.logger.error(getName());
			}
		}
	}
}
