package be.coworking.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "bookings")
@Data
@NoArgsConstructor
public class Booking {

   @Id
   @GeneratedValue
    private UUID id;
    private LocalDate date;

    @ManyToOne
    private User userId;
    private String email;

    @ManyToOne
    private Workstation workstationId;

    public Booking(LocalDate date, User userId, String email, Workstation workstationId) {
        this.date = date;
        this.userId = userId;
        this.email = userId.getEmail();
        this.workstationId = workstationId;
    }
}
