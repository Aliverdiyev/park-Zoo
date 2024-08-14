package service;

import db.Database;
import model.AquaticCarnivorous;
import model.AquaticNonCarnivorous;
import model.TerrestrialCarnivorous;
import model.TerrestrialNonCarnivorous;

import java.util.Scanner;

import static db.Database.*;

public class AnimalService {
    public void addAquaticCarnivorous() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the type: ");
        String spec = scanner.nextLine();
        System.out.println("Enter the age: ");
        int age = scanner.nextInt();
        System.out.println("Can it swim? (Enter: true or false)");
        boolean canSwim = scanner.nextBoolean();
        aquaticCarnivorous.add(new AquaticCarnivorous(spec, age, canSwim));
        System.out.println("carnivorous fish added to the Database");
        System.out.println();
    }

    public void getAllAquaticCarnivorous() {
        for (AquaticCarnivorous carnivorous : aquaticCarnivorous) {
            System.out.println(carnivorous);
        }
        System.out.println();
    }

    public void addAquaticNonCarnivorous() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the type: ");
        String spec = scanner.nextLine();
        System.out.println("Enter the age: ");
        int age = scanner.nextInt();
        System.out.println("Can it swim? (Enter: true or false): ");
        boolean canSwim = scanner.nextBoolean();
        Database.aquaticNonCarnivorous.add(new AquaticNonCarnivorous(spec, age, canSwim));
        System.out.println("non-carnivorous fish added to the Database");
        System.out.println();
    }

    public void getAllAquaticNonCarnivorous() {
        for (AquaticNonCarnivorous nonCarnivorous : aquaticNonCarnivorous) {
            System.out.println(nonCarnivorous);
        }
        System.out.println();
    }

    public void addATerrestrialCarnivorous() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the type:  ");
        String spec = scanner.nextLine();
        System.out.println("Enter the age: ");
        int age = scanner.nextInt();
        System.out.println("Enter what kind of legged animal it is: ");
        int numberOfLegs = scanner.nextInt();
        Database.terrestrialCarnivorous.add(new TerrestrialCarnivorous(spec, age, numberOfLegs));
        System.out.println("carnivorous animal successfully added to Database ");
        System.out.println();
    }

    public void getAllTerrestrialCarnivorous() {
        if (terrestrialCarnivorous.isEmpty()) {
            System.out.println("Please add carnivorous animal creature to the Database");
        }
        for (TerrestrialCarnivorous carnivorous : terrestrialCarnivorous) {
            System.out.println(carnivorous);
        }
        System.out.println();
    }

    public void addATerrestrialNonCarnivorous() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the type:  ");
        String spec = scanner.nextLine();
        System.out.println("Enter the age: ");
        int age = scanner.nextInt();
        System.out.println("Enter what kind of legged animal it is: ");
        int numberOfLegs = scanner.nextInt();
        Database.terrestrialNonCarnivorous.add(new TerrestrialNonCarnivorous(spec, age, numberOfLegs));
        System.out.println("non-carnivorous animal has been successfully added to Database");
        System.out.println();
    }

    public void getAllTerrestrialNonCarnivorous() {
        for (TerrestrialNonCarnivorous nonCarnivorous : terrestrialNonCarnivorous) {
            System.out.println(nonCarnivorous);
        }
        System.out.println();
    }
}