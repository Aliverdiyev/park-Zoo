package model;

public class TerrestrialNonCarnivorous extends Terrestrial {
    public TerrestrialNonCarnivorous() {

    }

    public TerrestrialNonCarnivorous(String species, int age, int numberOfLegs) {
        super(species, age, numberOfLegs);
    }

    public void graze() {
        System.out.println("The non-carnivorous terrestrial " + getSpecies() + " is grazing.");
    }

    @Override
    public String toString() {
        return "Species = " + super.getSpecies() +
                ", Age = " + super.getAge() +
                ", Number of legs = " + super.getNumberOfLegs();
    }
}