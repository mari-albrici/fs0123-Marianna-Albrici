package bed30.Factory;

import bed30.Factory.entities.ProcessControl;
import bed30.Factory.entities.ProcessControlFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@SpringBootTest
class FactoryApplicationTests {

	private ProcessControl probe;
	@BeforeEach
	void setUp() {
		probe = ProcessControlFactory.createProbe(1, 123.456, 789.012, 6, "http://host/alarm");
	}
	@Test
	void testSendAlarm() {
		assertDoesNotThrow(() -> probe.sendAlarm());
	}

}
