package designPatterns.es2;

import designPatterns.es2.entities.Book;
import designPatterns.es2.entities.Page;
import designPatterns.es2.entities.Section;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Es2Application {

	public static void main(String[] args) {

		SpringApplication.run(Es2Application.class, args);

		Page one = new Page(0.01, "Socrate", "Lorem Ipsum");
		Page two = new Page(0.02, "Euclide", "La geometria mi fa schifo");

		Section sectionOne = new Section();
		sectionOne.addPageToSection(one);

		Section sectionTwo = new Section();
		sectionTwo.addPageToSection(two);

		Book librone = new Book();
		librone.addSectionToBook(sectionOne);
		librone.addSectionToBook(sectionTwo);

		librone.printBook();
		System.out.println(librone.getPages());
		System.out.println(librone.getAuthors());

	}

}
