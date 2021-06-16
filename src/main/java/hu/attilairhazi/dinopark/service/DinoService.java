package hu.attilairhazi.dinopark.service;

import hu.attilairhazi.dinopark.domain.Dino;
import hu.attilairhazi.dinopark.domain.DinoType;
import hu.attilairhazi.dinopark.dto.DinoCreateCommand;
import hu.attilairhazi.dinopark.repository.DinoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DinoService {

    private DinoRepository dinoRepository;

    @Autowired
    public DinoService(DinoRepository dinoRepository) {
        this.dinoRepository = dinoRepository;
    }

    private static Dino convertToDino(DinoCreateCommand command) {
        return new Dino()
                .setName(command.getName())
                .setRace(command.getRace())
                .setDinoType(DinoType.valueOf(command.getDinoType().toUpperCase()));
    }

    public Dino saveDino(DinoCreateCommand command) {
        return dinoRepository.saveDino(convertToDino(command));
    }

    public List<Dino> getDinos() {
        return dinoRepository.getDinos();
    }

    public List<Dino> getDinosByType(String dinoType) {
        return dinoRepository.getDinosByType(DinoType.valueOf(dinoType.toUpperCase()));
    }

    public Dino getDinoById(int id) {
        return dinoRepository.getDinoById(id);
    }
}
