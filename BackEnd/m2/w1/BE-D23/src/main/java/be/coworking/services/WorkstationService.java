package be.coworking.services;

import be.coworking.entities.Booking;
import be.coworking.entities.Workstation;
import be.coworking.exceptions.NotFound;
import be.coworking.repositories.BookingRepository;
import be.coworking.repositories.WorkstationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class WorkstationService {

    @Autowired
    private WorkstationRepository workRepo;

    public Workstation create(Workstation w){
        return workRepo.save(w);
    }

    public List<Workstation> find(int page){
        Pageable pageable = PageRequest.of(page, 10);
        return workRepo.findAll();
    }

    public Workstation findById(UUID id) throws NotFound {
        return workRepo.findById(id).orElseThrow(() -> new NotFound("Workstation not found"));
    }

    public Workstation findByIdAndUpdate(UUID id, Workstation w) throws NotFound {
        Workstation found = this.findById(id);

        found.setId(id);
        found.setBuilding(w.getBuilding());
        found.setDescription(w.getDescription());
        found.setType(w.getType());
        found.setSeats(w.getSeats());

        return workRepo.save(found);
    }

    public void findByIdAndDelete(UUID id) throws NotFound{
        Workstation foundB = this.findById(id);
        workRepo.delete(foundB);
    }
}
