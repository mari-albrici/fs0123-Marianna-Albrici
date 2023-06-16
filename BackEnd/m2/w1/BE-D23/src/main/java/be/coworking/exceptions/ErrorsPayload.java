package be.coworking.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class ErrorsPayload {
    private String message;
    private Date timestamp;
    private int internalCode;

}
