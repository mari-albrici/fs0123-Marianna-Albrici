package designPatterns.es1.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;

public class Adapter implements DataSource {
    private Info info;
    private UserData userData;


    public static String getNomeCompletoDaInfo(Info info) {
        String nome = info.getNome();
        String cognome = info.getCognome();
        return nome + " " + cognome;
    }

    @Override
    public String getNomeCompleto() {
        return null;
    }

    @Override
    public int getEta() {
        return 0;
    }

    public static int getEtaDaInfo(Info info) {
        LocalDate dataDiNascita = info.getDataDiNascita();
        LocalDate currentDate = LocalDate.now();
        return currentDate.getYear() - dataDiNascita.getYear();
    }
}
