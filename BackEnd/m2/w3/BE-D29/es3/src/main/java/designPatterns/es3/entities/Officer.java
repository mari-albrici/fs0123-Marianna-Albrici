package designPatterns.es3.entities;

import designPatterns.es3.entities.enums.Role;
import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Officer {
    private long salary;
    private Role role;
}
