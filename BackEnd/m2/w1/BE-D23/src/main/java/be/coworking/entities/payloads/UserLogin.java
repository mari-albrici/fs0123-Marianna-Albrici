package be.coworking.entities.payloads;

import ch.qos.logback.core.boolex.Matcher;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class UserLogin {
    @NotNull
    String email;
    @NotNull
    String password;
}
