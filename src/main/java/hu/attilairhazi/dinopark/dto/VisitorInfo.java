package hu.attilairhazi.dinopark.dto;

public class VisitorInfo {

    private String name;
    private int rating;

    public String getName() {
        return name;
    }

    public VisitorInfo setName(String name) {
        this.name = name;
        return this;
    }

    public int getRating() {
        return rating;
    }

    public VisitorInfo setRating(int rating) {
        this.rating = rating;
        return this;
    }
}
