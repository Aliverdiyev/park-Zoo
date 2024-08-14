package model;

public class TerrestrialCarnivorous extends Terrestrial {

    public TerrestrialCarnivorous() {
    }

    public TerrestrialCarnivorous(String species, int age, int numberOfLegs) {
        super(species, age, numberOfLegs);
    }

    public void hunt() {
        System.out.println("The carnivorous terrestrial " + getSpecies() + " is hunting.");
    }

    @Override
    public String toString() {
        return "Species = " + super.getSpecies() +
                ", Age = " + super.getAge() +
                ", Number of legs = " + super.getNumberOfLegs();
    }
}