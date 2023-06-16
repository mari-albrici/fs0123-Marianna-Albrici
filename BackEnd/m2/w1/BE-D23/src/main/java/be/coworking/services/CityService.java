package be.coworking.services;

import be.coworking.entities.City;
import be.coworking.entities.User;
import be.coworking.exceptions.NotFound;
import be.coworking.repositories.CityRepository;
import be.coworking.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CityService {
    @Autowired
    private CityRepository cityRepo;

    public City create(City c){
        return cityRepo.save(c);
    }

    public City findById(UUID id) throws NotFound {
        return cityRepo.findById(id).orElseThrow(() -> new NotFound("City not found"));
    }
}
