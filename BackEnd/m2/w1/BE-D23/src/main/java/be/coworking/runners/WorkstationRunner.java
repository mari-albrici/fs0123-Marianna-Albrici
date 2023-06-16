package be.coworking.runners;

import be.coworking.entities.User;
import be.coworking.entities.Workstation;
import be.coworking.entities.enums.Type;
import be.coworking.services.BuildingService;
import be.coworking.services.UserService;
import be.coworking.services.WorkstationService;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Locale;
import java.util.UUID;

@Component
public class WorkstationRunner implements CommandLineRunner {
    @Autowired
    private WorkstationService workService;

    @Autowired
    private BuildingService buildingService;

    @Override
    public void run(String... args){
//        Workstation workOne = new Workstation();
//        workOne.setDescription("Single desk space");
//        workOne.setType(Type.PRIVATE);
//        workOne.setSeats(1);
//        workOne.setBuilding(buildingService.findById(602));
//        workService.create(workOne);
//
//        Workstation workTwo = new Workstation();
//        workTwo.setDescription("Open space with singular desks available");
//        workTwo.setType(Type.OPENSPACE);
//        workTwo.setSeats(15);
//        workTwo.setBuilding(buildingService.findById(603));
//        workService.create(workTwo);

//        Workstation workThree = new Workstation();
//        workThree.setDescription("30 places meeting room with sharing screen");
//        workThree.setType(Type.MEETINGROOM);
//        workThree.setSeats(30);
//        workThree.setBuilding(buildingService.findById(603));
//        workService.create(workThree);
    }

}
