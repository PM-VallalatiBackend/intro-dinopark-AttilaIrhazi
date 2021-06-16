package hu.attilairhazi.dinopark.service;

import hu.attilairhazi.dinopark.domain.DinoType;
import hu.attilairhazi.dinopark.domain.Visitor;
import hu.attilairhazi.dinopark.dto.VisitorCreateCommand;
import hu.attilairhazi.dinopark.dto.VisitorInfo;
import hu.attilairhazi.dinopark.repository.DinoRepository;
import hu.attilairhazi.dinopark.repository.VisitorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VisitorService {

    private VisitorRepository visitorRepository;
    private DinoRepository dinoRepository;

    public VisitorService(VisitorRepository visitorRepository, DinoRepository dinoRepository) {
        this.visitorRepository = visitorRepository;
        this.dinoRepository = dinoRepository;
    }

    public VisitorInfo addVisitor(VisitorCreateCommand visitorCreateCommand) {
        Visitor visitor = convertToVisitor(visitorCreateCommand);
        Visitor savedVisitor = visitorRepository.addVisitor(visitor);
        return convertToInfo(savedVisitor);
    }

    public Visitor convertToVisitor(VisitorCreateCommand visitorCreateCommand) {
        return new Visitor()
                .setName(visitorCreateCommand.getName())
                .setFavouriteDinoType(DinoType.valueOf(visitorCreateCommand.getFavouriteDinoType().toUpperCase()))
                .setRating(getRatingOfVisitor(visitorCreateCommand));
    }

    public VisitorInfo convertToInfo(Visitor visitor) {
        return new VisitorInfo()
                .setName(visitor.getName())
                .setRating(visitor.getRating());
    }

    public int getRatingOfVisitor(VisitorCreateCommand visitorCreateCommand) {
        if (dinoRepository.getDinos().size() < 3) {
            return 1;
        } else return (int) dinoRepository.getDinos().stream()
                .mapToInt(e -> (e.getDinoType().name()).equals(visitorCreateCommand.getFavouriteDinoType()) ? 5 : 2)
                .average()
                .orElse(0);
    }

    public List<VisitorInfo> listVisitors() {
        List<Visitor> visitors = visitorRepository.listVisitors();
        return visitors.stream()
                .map(this::convertToInfo)
                .collect(Collectors.toList());
    }
}
