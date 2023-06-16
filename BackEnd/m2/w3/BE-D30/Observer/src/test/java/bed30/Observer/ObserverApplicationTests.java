package bed30.Observer;

import bed30.Observer.entities.ControlCentre;
import bed30.Observer.entities.Probe;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@SpringBootTest
class ObserverApplicationTests {

	private ControlCentre controlCentre;
	private Probe probe;

	@BeforeEach
	void setUp() {
		controlCentre = new ControlCentre();
		probe = new Probe(controlCentre, 0000);
		controlCentre.addProbe(probe);
	}

	@Test
	void testAlarmControl(){
		assertDoesNotThrow(() -> probe.alarmControl(probe.getId(), 45.806452, 10.229569, 6));
		assertDoesNotThrow(() -> probe.alarmControl(probe.getId(), 45.806452, 10.229569, 1));
	}

}
