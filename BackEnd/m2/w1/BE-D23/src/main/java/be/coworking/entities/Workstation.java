package be.coworking.entities;

import be.coworking.entities.enums.Type;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "workstations")
@Data
@NoArgsConstructor
public class Workstation {

    @Id
    @GeneratedValue
    private UUID id;

    private String description;

    @Enumerated(EnumType.STRING)
    private Type type;
    private int seats;
    @ManyToOne
    private Building building;

    public Workstation(String description, Type type, int seats, Building building) {
    }
}
