package exerciseOne;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

public class Main {
	
	public static Logger logger = (Logger) LoggerFactory.getLogger(Main.class);


	public static void main(String[] args) {
		
		ThreadOne asterisk = new ThreadOne("*");
		ThreadOne hashtag = new ThreadOne("#");
		
		asterisk.start();
		hashtag.start();
		
		
	}

}
