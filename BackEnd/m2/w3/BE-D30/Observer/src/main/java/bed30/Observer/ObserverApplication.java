package bed30.Observer;

import bed30.Observer.entities.ControlCentre;
import bed30.Observer.entities.Probe;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ObserverApplication {

	public static void main(String[] args) {

		SpringApplication.run(ObserverApplication.class, args);

		ControlCentre controlCentre = new ControlCentre();

		Probe probeOne = new Probe(controlCentre, 0001);
		controlCentre.addProbe(probeOne);

		probeOne.alarmControl(probeOne.getId(), 45.806452, 10.229569, 3);
		probeOne.alarmControl(probeOne.getId(), 45.232292, 9.720953, 7);

		Probe probeTwo = new Probe(controlCentre, 0002);
		controlCentre.addProbe(probeTwo);

		probeTwo.alarmControl(probeTwo.getId(), 45.806452, 10.229569, 5);
		probeTwo.alarmControl(probeTwo.getId(), 45.232292, 9.720953, 9);

		Probe probeThree = new Probe(controlCentre, 0003);
		controlCentre.addProbe(probeThree);

		probeThree.alarmControl(probeThree.getId(), 43.813813, 15.002888, 1);
		probeThree.alarmControl(probeThree.getId(), 43.792739, 14.992629, 6);
	}

}
