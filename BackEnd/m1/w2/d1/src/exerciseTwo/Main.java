package exerciseTwo;

import java.util.Scanner;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

public class Main {

	private static Logger logger = (Logger) LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {

		int km;
		int lt;

		Scanner input = new Scanner(System.in);

		System.out.println("How many km?");
		km = input.nextInt();
		System.out.println(km + "km");

		System.out.println("How many lt?");
		lt = input.nextInt();
		System.out.println(lt + "lt");

		consumi(km, lt);

		input.close();

	}

	public static void consumi(int km, int lt) {

		try {

			int consumi = km / lt;
			System.out.println("Consumption:" + consumi);

		} catch (ArithmeticException e) {

			logger.warn("SOMETHING HAPPENED HERE: " + e.getMessage());

		}

	}

}
