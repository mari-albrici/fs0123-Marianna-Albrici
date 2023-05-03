package main;

import java.util.Arrays;

public class Sim {
	
	long number;
	double credit;
	double duration;
	
	public Sim(long number) {
		this.number = number;
		this.credit = 00.00;
	}
	
	Calls call = new Calls(number, 987654, 1.30);
	Calls call2 = new Calls(number, 198765, 5.37);
	Calls call3 = new Calls(number, 234567, 4.01);
	Calls call4 = new Calls(number, 456789, 0.48);
	Calls call5 = new Calls(number, 675432, 2.26);
	
	Object[] previousCalls = {call, call2, call3, call4, call5};
	
	public void printPhoneData(Sim sim) {
		System.out.println("Phone number: " + sim.number);
		System.out.println("Phone credit: " + sim.credit);
		System.out.println("Last 5 calls: " + Arrays.toString(previousCalls));
	}

}
