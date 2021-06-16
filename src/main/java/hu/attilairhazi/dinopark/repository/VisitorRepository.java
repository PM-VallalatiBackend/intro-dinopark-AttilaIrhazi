package hu.attilairhazi.dinopark.repository;

import hu.attilairhazi.dinopark.domain.Visitor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class VisitorRepository {

    private int lastIndexUsed = 0;
    private List<Visitor> visitors = new ArrayList<>();

    public Visitor addVisitor(Visitor visitor) {
        lastIndexUsed++;
        visitor.setId(lastIndexUsed);
        visitors.add(visitor);
        return visitor;
    }

    public List<Visitor> listVisitors() {
        return new ArrayList<>(visitors);
    }
}
