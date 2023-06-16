package be.coworking.repositories;

import be.coworking.entities.Workstation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface WorkstationRepository extends JpaRepository<Workstation, UUID> {
}
