package be.coworking.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import be.coworking.exceptions.UnknownLanguage;
import be.coworking.services.PrenotazioneService;

@RestController
@RequestMapping("/bookings")
public class PrenotazioneController {

	@Autowired
	PrenotazioneService prenotazioneService;
	
	@GetMapping("/{lang}")
	public String getMsg(@PathVariable String lang, @RequestParam String d){
      return prenotazioneService.getInfoMSg(lang).orElseThrow(() -> new UnknownLanguage(lang));
  }
}

