package exerciseTwo;

import java.util.List;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

import java.util.ArrayList;

public class Main {
	
	public static Logger logger = (Logger) LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
		
		int n = 3000;
		
		List<Integer> numberArray = new ArrayList<Integer>();
		
		for (int i=0; i<n; i++) {
			numberArray.add((int) (Math.random()*100));
		}
		
//		System.out.println(numberArray.size());
		
		List<Integer> numberOne = numberArray.subList(0, 1000);
		List<Integer> numberTwo = numberArray.subList(1000, 2000);
		List<Integer> numberThree = numberArray.subList(2000, 3000);
		
//		System.out.println(numberOne.size());
//		System.out.println(numberTwo.size());
//		System.out.println(numberThree.size());
		
		ThreadPartialSum partialOne = new ThreadPartialSum(numberOne);
		ThreadPartialSum partialTwo = new ThreadPartialSum(numberTwo);
		ThreadPartialSum partialThree = new ThreadPartialSum(numberThree);
		
		
		try {
			partialOne.start();
			partialTwo.start();
			partialThree.start();
			
			partialOne.join();
			partialTwo.join();
			partialThree.join();
			
		} catch (InterruptedException e) {
			Main.logger.error("SOMETHING WENT WRONG:" + e);
		}
		
		
		int totalResult = partialOne.getSum() + partialTwo.getSum() + partialThree.getSum();
		
		Main.logger.info("The total sum is: " + totalResult);
		
	}

}
