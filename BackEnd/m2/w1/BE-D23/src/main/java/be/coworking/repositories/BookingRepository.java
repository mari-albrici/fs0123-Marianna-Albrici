package be.coworking.repositories;

import be.coworking.entities.Booking;
import be.coworking.entities.Workstation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Repository
public interface BookingRepository extends JpaRepository<Booking, UUID> {

    Booking findByWorkstationIdAndDate(Workstation workstationId, LocalDate date);

    List<Booking> findByEmail(String email);
}
