package designPatterns.es1;

import designPatterns.es1.entities.Adapter;
import designPatterns.es1.entities.Info;
import designPatterns.es1.entities.UserData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

@SpringBootApplication
public class Es1Application {
	public static void main(String[] args) {

		SpringApplication.run(Es1Application.class, args);

		Info a = new Info("Marianna", "Albrici", LocalDate.of(1996, 03, 13));

		UserData user = new UserData();

		user.setNomeCompleto(Adapter.getNomeCompletoDaInfo(a));
		user.setEta(Adapter.getEtaDaInfo(a));

		System.out.println(a);
		System.out.println(user);
	}

}
