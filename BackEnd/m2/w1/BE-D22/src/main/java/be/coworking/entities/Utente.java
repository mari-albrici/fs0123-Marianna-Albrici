package be.coworking.entities;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Utente {
	private int id;
	private String name;
	private String lastname;
	private String email;
	
	public Utente(String name, String lastname) {
		this.name = name;
		this.lastname = lastname;
	}
}