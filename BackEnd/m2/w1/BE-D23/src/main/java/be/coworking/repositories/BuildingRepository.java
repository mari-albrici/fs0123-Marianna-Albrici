package be.coworking.repositories;

import be.coworking.entities.Building;
import be.coworking.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface BuildingRepository extends JpaRepository<Building, UUID> {
    Optional<Building> findById(int id);
}
