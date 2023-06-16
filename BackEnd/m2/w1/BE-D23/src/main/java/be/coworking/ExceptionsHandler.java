package be.coworking;

import be.coworking.exceptions.ErrorsPayload;
import be.coworking.exceptions.NotFound;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

public class ExceptionsHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(NotFound.class)
    public ResponseEntity<ErrorsPayload> handleNotFound(NotFound e) {
        ErrorsPayload payload = new ErrorsPayload(e.getMessage(), new Date(), 404);
        return new ResponseEntity<ErrorsPayload>(payload, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorsPayload> handleGenericErrors(Exception e) {
        System.out.println(e);
        ErrorsPayload payload = new ErrorsPayload("GENERIC SERVER ERROR! WE GONNA FIX IT ASAP!", new Date(), 500);
        return new ResponseEntity<ErrorsPayload>(payload, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}