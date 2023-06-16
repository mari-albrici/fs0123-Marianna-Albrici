package bed30.Proxy;

import bed30.Proxy.entities.ControlCentre;
import bed30.Proxy.entities.Probe;
import bed30.Proxy.entities.proxys.ControlCentreProxy;
import bed30.Proxy.entities.proxys.ProbeProxy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProxyApplication {

	public static void main(String[] args) {

		SpringApplication.run(ProxyApplication.class, args);

		Probe probe = new Probe(0001, 123.456, 789.012, 6);

		ControlCentre controlCentreProxy = new ControlCentre(probe, "https://host/alarm");

		controlCentreProxy.sendAlarm();
	}

}
