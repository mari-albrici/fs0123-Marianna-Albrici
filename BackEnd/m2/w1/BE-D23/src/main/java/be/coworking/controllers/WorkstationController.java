package be.coworking.controllers;

import be.coworking.entities.City;
import be.coworking.entities.User;
import be.coworking.entities.Workstation;
import be.coworking.entities.enums.Type;
import be.coworking.services.WorkstationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/workstations")
public class WorkstationController {

    @Autowired
    private WorkstationService workService;
    @GetMapping("")
    public List<Workstation> getWorkstation(@RequestParam(defaultValue = "0") int page){
        return workService.find(page);
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public Workstation saveWorkstation(@RequestBody Workstation body) {
        return workService.create(body);
    }

    @GetMapping("/{workId}")
    public Workstation getWorkstation(@PathVariable UUID workId) throws Exception {
        return workService.findById(workId);
    }

    @PutMapping("/{workId}")
    public Workstation updateWorkstation(@PathVariable UUID workId, @RequestBody Workstation body) throws Exception {
        return workService.findByIdAndUpdate(workId, body);
    }

    @DeleteMapping("/{workId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteWorkstation(@PathVariable UUID workId) throws Exception {
        workService.findByIdAndDelete(workId);
    }
}
