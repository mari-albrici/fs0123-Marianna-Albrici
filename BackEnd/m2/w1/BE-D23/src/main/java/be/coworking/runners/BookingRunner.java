package be.coworking.runners;

import be.coworking.entities.Booking;
import be.coworking.services.BookingService;
import be.coworking.services.UserService;
import be.coworking.services.WorkstationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.UUID;

@Component
public class BookingRunner implements CommandLineRunner {

    @Autowired
    private BookingService bookingService;

    @Autowired
    private WorkstationService workService;

    @Autowired
    private UserService userService;

    @Override
    public void run(String... args) throws Exception {
        Booking bookingOne = new Booking();
        bookingOne.setWorkstationId(workService.findById(UUID.fromString("bc0f54f4-c8ab-4692-9848-5f5fe52b889d")));
        bookingOne.setDate(LocalDate.of(2023, 10, 5));
        bookingOne.setUserId(userService.findById(UUID.fromString("053b19c2-4c90-49a5-a25a-968c22379aa8")));
//        bookingService.create(bookingOne);
    }
}
