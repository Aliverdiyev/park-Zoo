package model;

public class Aquatic extends Animal {
    private final boolean canSwim;

    public Aquatic(String species, int age, boolean canSwim) {
        super(species, age);
        this.canSwim = canSwim;
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    public void swim() {
        if (canSwim) {
            System.out.println("The aquatic " + getSpecies() + " is swimming.");
        } else {
            System.out.println("This aquatic " + getSpecies() + " cannot swim.");
        }
    }

    // Additional method for aquatic animals
    public void dive() {
        System.out.println("The aquatic " + getSpecies() + " is diving.");
    }
}