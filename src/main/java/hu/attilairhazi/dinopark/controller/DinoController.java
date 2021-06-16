package hu.attilairhazi.dinopark.controller;

import hu.attilairhazi.dinopark.domain.Dino;
import hu.attilairhazi.dinopark.dto.DinoCreateCommand;
import hu.attilairhazi.dinopark.service.DinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dino")
public class DinoController {

    private DinoService dinoService;

    @Autowired
    public DinoController(DinoService dinoService) {
        this.dinoService = dinoService;
    }

    @PostMapping("/savedino")
    public ResponseEntity<Dino> saveDino(@RequestBody DinoCreateCommand command) {
        return new ResponseEntity<>(dinoService.saveDino(command), HttpStatus.OK);
    }

    @GetMapping("/dinos")
    public ResponseEntity<List<Dino>> getDinos() {
        return new ResponseEntity<>(dinoService.getDinos(), HttpStatus.OK);
    }

    @GetMapping("/dinos/{dinoType}")
    public ResponseEntity<List<Dino>> getDinosByType(@PathVariable String dinoType) {
        return new ResponseEntity<>(dinoService.getDinosByType(dinoType), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Dino> getDinoById(@PathVariable int id) {
        if (dinoService.getDinoById(id) != null) {
            return new ResponseEntity<>(dinoService.getDinoById(id), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
