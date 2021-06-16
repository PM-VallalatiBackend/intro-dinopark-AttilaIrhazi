package hu.attilairhazi.dinopark.dto;

public class DinoCreateCommand {

    private String name;
    private String race;
    private String dinoType;

    public DinoCreateCommand() {
    }

    public String getName() {
        return name;
    }

    public DinoCreateCommand setName(String name) {
        this.name = name;
        return this;
    }

    public String getRace() {
        return race;
    }

    public DinoCreateCommand setRace(String race) {
        this.race = race;
        return this;
    }

    public String getDinoType() {
        return dinoType;
    }

    public DinoCreateCommand setDinoType(String dinoType) {
        this.dinoType = dinoType;
        return this;
    }
}
