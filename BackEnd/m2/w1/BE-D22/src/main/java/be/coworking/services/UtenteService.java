package be.coworking.services;

import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Optional;
import java.util.Random;

import org.springframework.stereotype.Service;

import be.coworking.entities.Utente;

@Service
public class UtenteService {

	private List<Utente> users = new ArrayList<>(List.of(new Utente("Aldo", "Baglio"), new Utente("Giovanni", "Storti"),
			new Utente("Giacomo", "Poretti")));

	public List<Utente> getUsers() {
		return this.users;
	}

	public Optional<Utente> findUserById(int id) {
		Utente u = null;
		for (Utente user : users) {
			if (user.getId() == id)
				u = user;
		}

		return Optional.ofNullable(u);
	}

	public Optional<Utente> findUserByName(String name) {
		Utente u = null;
		for (Utente user : users) {
			if (user.getName().equals(name))
				u = user;
		}

		return Optional.ofNullable(u);
	}

	public Utente saveNewUser(Utente user) {
		Random rndm = new Random();
		user.setId(rndm.nextInt());
		this.users.add(user);
		return user;
	}

	public Optional<Utente> findUserByIdAndUpdate(int id, Utente user) {
		Utente found = null;

		for (Utente u : users) {
			if (u.getId() == id) {
				found = u;
				found.setName(user.getName());
				found.setLastname(user.getLastname());
				found.setId(id);
			}
		}
		return Optional.ofNullable(found);
	}

	public Optional<Utente> findUserByIdAndDelete(int id) {
		ListIterator<Utente> iterator = this.users.listIterator();

		Utente found = null;
		while (iterator.hasNext()) {

			Utente currentUser = iterator.next();
			if (currentUser.getId() == id) {
				found = currentUser;
				iterator.remove();
			}
		}
		return Optional.ofNullable(found);
	}

}
