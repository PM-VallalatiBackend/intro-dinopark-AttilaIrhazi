package hu.attilairhazi.dinopark.service;

import hu.attilairhazi.dinopark.domain.Visitor;
import hu.attilairhazi.dinopark.repository.VisitorRepository;
import org.springframework.stereotype.Service;

@Service
public class ParkService {

    private VisitorRepository visitorRepository;

    public ParkService(VisitorRepository visitorRepository) {
        this.visitorRepository = visitorRepository;
    }

    public Double getAverageRating() {
        return visitorRepository.listVisitors()
                .stream()
                .mapToDouble(Visitor::getRating)
                .average()
                .orElse(0);
    }
}
