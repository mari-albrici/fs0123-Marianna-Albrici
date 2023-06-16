package be.coworking.repositories;

import be.coworking.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface CityRepository extends JpaRepository<City, String> {
    Optional<City> findById(UUID id);
}
