package be.coworking.services;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.ArrayList;

import lombok.Data;

import org.springframework.stereotype.Service;

import be.coworking.entities.Edificio;
import be.coworking.entities.Postazione;
import be.coworking.entities.Prenotazione;
import be.coworking.entities.Utente;
import be.coworking.entities.enums.Tipo;

@Data
@Service
public class PrenotazioneService {

	private List<Prenotazione> prenotazioni = new ArrayList<>(List.of(
			new Prenotazione(
					new Utente("Mario", "Rossi"), 
					new Postazione(1, "coworking", Tipo.OPENSPACE, 10, new Edificio(1, "Blocco A", "Via Maj", "Milano")))
			));

	private Map<String, String> infoPrenotazioniMsg = Map.of(
            "it", "Queste sono le regole per le prenotazioni per le nostre postazioni:",
            "en", "Here are the booking rules for our spaces:"
    );
    public Optional<String>  getInfoMSg(String lang){
        return Optional.ofNullable(infoPrenotazioniMsg.get(lang));
    }

}
