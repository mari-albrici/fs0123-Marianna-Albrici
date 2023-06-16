package be.coworking.runners;

import be.coworking.entities.City;
import be.coworking.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CityRunner implements CommandLineRunner {

    @Autowired
    private CityService cityService;

    public void run(String... args){
//        City cityOne = new City();
//        cityOne.setName("cityOne");
//        cityService.create(cityOne);
    }


}
