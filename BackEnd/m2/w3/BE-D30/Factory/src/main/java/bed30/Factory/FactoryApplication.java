package bed30.Factory;

import bed30.Factory.entities.ProcessControl;
import bed30.Factory.entities.ProcessControlFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryApplication {

	public static void main(String[] args) {

		SpringApplication.run(FactoryApplication.class, args);

		ProcessControl probe = ProcessControlFactory.createProbe( 1, 123.456, 789.012, 6, "http://host/alarm");

		probe.sendAlarm();
	}

}
