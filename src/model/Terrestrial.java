package model;

public class Terrestrial extends Animal {
    private int numberOfLegs;

    public Terrestrial() {
        super();
    }

    public Terrestrial(String species, int age, int numberOfLegs) {
        super(species, age);
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }


    public void move() {
        System.out.println("The terrestrial " + getSpecies() + " is moving.");
    }

    public void makeSound() {
        System.out.println("The terrestrial " + getSpecies() + " is making a sound.");
    }
}