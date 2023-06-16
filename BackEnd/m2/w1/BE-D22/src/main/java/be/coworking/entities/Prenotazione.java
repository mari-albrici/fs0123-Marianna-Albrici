package be.coworking.entities;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Prenotazione {

	private Utente utente; 
	private Postazione postazione;
}
