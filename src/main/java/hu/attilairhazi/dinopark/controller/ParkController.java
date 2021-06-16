package hu.attilairhazi.dinopark.controller;

import hu.attilairhazi.dinopark.service.ParkService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/park")
public class ParkController {

    private ParkService parkService;

    public ParkController(ParkService parkService) {
        this.parkService = parkService;
    }

    @GetMapping
    public ResponseEntity<Double> getAverageRating() {
        return new ResponseEntity<>(parkService.getAverageRating(), HttpStatus.OK);
    }
}
