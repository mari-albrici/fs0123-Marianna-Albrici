package bed30.Proxy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import bed30.Proxy.entities.Probe;
import bed30.Proxy.entities.ControlCentre;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@SpringBootTest
class ProxyApplicationTests {
	private Probe probe;
	private ControlCentre controlCentreProxy;

	@BeforeEach
	void setUp() {
		probe = new Probe(0001, 123.456, 789.012, 6);
		controlCentreProxy = new ControlCentre(probe, "https://host/alarm");
	}

	@Test
	void testSendAlarm() {
		assertDoesNotThrow(() -> controlCentreProxy.sendAlarm());
	}

}
