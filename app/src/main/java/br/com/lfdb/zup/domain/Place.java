package br.com.lfdb.zup.domain;

public class Place {

    private String description;
    private String reference;

    public Place() {
    }

    public Place(String description, String reference) {
        this.description = description;
        this.reference = reference;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    @Override
    public String toString() {
        return description;
    }
}
