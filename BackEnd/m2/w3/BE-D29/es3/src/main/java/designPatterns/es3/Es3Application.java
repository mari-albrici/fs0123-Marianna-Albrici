package designPatterns.es3;

import designPatterns.es3.handlers.RoleChecker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Es3Application {

	public static void main(String[] args) {

		SpringApplication.run(Es3Application.class, args);

		long salary = 3560;

		RoleChecker roleChecker = new RoleChecker();

		System.out.println(roleChecker.roleCheck(salary));
	}

}
