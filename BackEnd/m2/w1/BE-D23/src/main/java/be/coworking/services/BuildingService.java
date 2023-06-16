package be.coworking.services;

import be.coworking.entities.Building;
import be.coworking.exceptions.NotFound;
import be.coworking.repositories.BuildingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class BuildingService {

    @Autowired
    private BuildingRepository buildingRepo;

    @Autowired
    private PasswordEncoder bcrypt;

    public Building create(Building b){
    b.setAccessCode(bcrypt.encode(b.getAccessCode()));
        return buildingRepo.save(b);
    }

    public Building findById(int id) throws NotFound {
        return buildingRepo.findById(id).orElseThrow(() -> new NotFound("Building not found"));
    }
}
