package hu.attilairhazi.dinopark.dto;

import hu.attilairhazi.dinopark.domain.DinoType;

public class VisitorCreateCommand {

    private String name;
    private DinoType favouriteDinoType;

    public VisitorCreateCommand() {
    }

    public String getName() {
        return name;
    }

    public VisitorCreateCommand setName(String name) {
        this.name = name;
        return this;
    }

    public DinoType getFavouriteDinoType() {
        return favouriteDinoType;
    }

    public VisitorCreateCommand setFavouriteDinoType(DinoType favouriteDinoType) {
        this.favouriteDinoType = favouriteDinoType;
        return this;
    }
}
