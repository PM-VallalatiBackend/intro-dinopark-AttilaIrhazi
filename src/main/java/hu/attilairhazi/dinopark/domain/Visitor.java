package hu.attilairhazi.dinopark.domain;

public class Visitor {

    private int id;
    private String name;
    private DinoType favouriteDinoType;
    private int rating;

    public Visitor() {
    }

    public String getName() {
        return name;
    }

    public Visitor setName(String name) {
        this.name = name;
        return this;
    }

    public DinoType getFavouriteDinoType() {
        return favouriteDinoType;
    }

    public Visitor setFavouriteDinoType(DinoType favouriteDinoType) {
        this.favouriteDinoType = favouriteDinoType;
        return this;
    }

    public int getRating() {
        return rating;
    }

    public Visitor setRating(int rating) {
        this.rating = rating;
        return this;
    }
}
