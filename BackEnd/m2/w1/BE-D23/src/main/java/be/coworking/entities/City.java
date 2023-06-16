package be.coworking.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Data
@Entity
@Table(name = "cities")
@NoArgsConstructor
@AllArgsConstructor
public class City {

    @Id
    @GeneratedValue
    private UUID id;

    private String name;

}
