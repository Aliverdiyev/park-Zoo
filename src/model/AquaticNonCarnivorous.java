package model;

public class AquaticNonCarnivorous extends Aquatic {
    public AquaticNonCarnivorous(String species, int age, boolean canSwim) {
        super(species, age, canSwim);
    }

    public void collectFood() {
        System.out.println("The non-carnivorous aquatic " + getSpecies() + " is collecting food.");
    }

    @Override
    public String toString() {
        return "Species = " + super.getSpecies() +
                ", Age = " + super.getAge() +
                ", canSwim = " + super.isCanSwim();
    }
}