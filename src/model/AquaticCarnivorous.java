package model;

public class AquaticCarnivorous extends Aquatic {
    public AquaticCarnivorous(String species, int age, boolean canSwim) {
        super(species, age, canSwim);
    }

    public void hunt() {
        System.out.println("The carnivorous aquatic " + getSpecies() + " is hunting.");
    }

    @Override
    public String toString() {
        return "Species = " + super.getSpecies() +
                ", Age = " + super.getAge() +
                ", canSwim = " + super.isCanSwim();
    }
}