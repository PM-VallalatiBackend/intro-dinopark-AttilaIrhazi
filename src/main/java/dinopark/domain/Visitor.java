package dinopark.domain;

public class Visitor {

    private String name;
    private DinoType favouriteDinoType;
    private int rating;

    public Visitor(String name, DinoType favouriteDinoType, int rating) {
        this.name = name;
        this.favouriteDinoType = favouriteDinoType;
        this.rating = rating;
    }
}
