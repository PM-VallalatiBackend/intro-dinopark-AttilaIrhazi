package dinopark.domain;

public class Dino {

    private String name;
    private String race;
    private DinoType dinoType;

    public Dino(String name, String race, DinoType dinoType) {
        this.name = name;
        this.race = race;
        this.dinoType = dinoType;
    }

    public static void main(String[] args) {
        System.out.println("A");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
}
