package designPatterns.es1.entities;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserData implements DataSource{

    private String nomeCompleto;
    private int eta;
    public void getData(DataSource ds) {
        nomeCompleto = ds.getNomeCompleto ();
        eta = ds.getEta();
    }
}
