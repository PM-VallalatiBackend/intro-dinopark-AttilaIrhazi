package hu.attilairhazi.dinopark.domain;

public class Dino {

    private int id;
    private String name;
    private String race;
    private DinoType dinoType;

    public Dino() {
    }

    public Dino(String name, String race, DinoType dinoType) {
        this.name = name;
        this.race = race;
        this.dinoType = dinoType;
    }

    public int getId() {
        return id;
    }

    public Dino setId(int id) {
        this.id = id;
        return this;
    }

    public DinoType getDinoType() {
        return dinoType;
    }

    public Dino setDinoType(DinoType dinoType) {
        this.dinoType = dinoType;
        return this;
    }

    public String getName() {
        return name;
    }

    public Dino setName(String name) {
        this.name = name;
        return this;
    }

    public String getRace() {
        return race;
    }

    public Dino setRace(String race) {
        this.race = race;
        return this;
    }
}
