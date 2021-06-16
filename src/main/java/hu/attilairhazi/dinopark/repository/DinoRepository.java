package hu.attilairhazi.dinopark.repository;

import hu.attilairhazi.dinopark.domain.Dino;
import hu.attilairhazi.dinopark.domain.DinoType;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class DinoRepository {

    private int lastIndexUsed = 0;
    private List<Dino> dinoList = new ArrayList<>();


    public Dino saveDino(Dino dino) {
        lastIndexUsed++;
        dino.setId(lastIndexUsed);
        dinoList.add(dino);
        return dino;
    }

    public List<Dino> getDinos() {
        return new ArrayList<>(dinoList);
    }

    public List<Dino> getDinosByType(DinoType dinoType) {
        return dinoList.stream()
                .filter(dino -> dino.getDinoType().equals(dinoType))
                .collect(Collectors.toList());
    }

    public Dino getDinoById(int id) {
        int searchedId = (int) dinoList.stream()
                .filter(e -> e.getId() == id)
                .count();
        if (searchedId == 1) {
            return dinoList.get(id - 1);
        } else return null;
    }
}
