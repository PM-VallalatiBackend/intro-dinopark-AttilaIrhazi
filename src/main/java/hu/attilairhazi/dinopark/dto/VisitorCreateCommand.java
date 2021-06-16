package hu.attilairhazi.dinopark.dto;

public class VisitorCreateCommand {

    private String name;
    private String favouriteDinoType;

    public VisitorCreateCommand() {
    }

    public String getName() {
        return name;
    }

    public VisitorCreateCommand setName(String name) {
        this.name = name;
        return this;
    }

    public String getFavouriteDinoType() {
        return favouriteDinoType;
    }

    public VisitorCreateCommand setFavouriteDinoType(String favouriteDinoType) {
        this.favouriteDinoType = favouriteDinoType;
        return this;
    }
}
