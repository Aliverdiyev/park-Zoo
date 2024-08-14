package util;

import service.AnimalService;

import java.util.Scanner;

public class MenuUtil {

    private MenuUtil() {
        throw new IllegalStateException("Utility class");
    }

    static AnimalService animalService = new AnimalService();

    public static void menu() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Hello, welcome to PARK-ZOO!");
            String textBlock = """
                    Select the category you are interested in!
                    1 -> Aquatic
                    2 -> Terrestrial
                    3 -> Exit the system
                    """;
            System.out.println(textBlock);
            int num = sc.nextInt();
            if (num == 1) {
                sc = new Scanner(System.in);
                String textBlockForAquatic = """
                        1 -> to add aquatic carnivorous
                        2 -> to see a list of aquatic carnivores
                        3 -> to add aquatic non-carnivorous
                        4 -> to see a list of aquatic non-carnivores
                        """;
                System.out.println(textBlockForAquatic);
                int aquaticCategory = sc.nextInt();
                switch (aquaticCategory) {
                    case 1:
                        animalService.addAquaticCarnivorous();
                        break;
                    case 2:
                        animalService.getAllAquaticCarnivorous();
                        break;
                    case 3:
                        animalService.addAquaticNonCarnivorous();
                        break;
                    case 4:
                        animalService.getAllAquaticNonCarnivorous();
                        break;
                    default:
                        break;
                }
            } else if (num == 2) {
                sc = new Scanner(System.in);
                String textBlockForTerrestrial = """
                        1 -> to add terrestrial carnivorous
                        2 -> to see a list of terrestrial carnivores
                        3 -> to add terrestrial non-carnivorous
                        4 -> to see a list of terrestrial non-carnivores
                        """;
                System.out.println(textBlockForTerrestrial);
                int terrestrialCategory = sc.nextInt();
                switch (terrestrialCategory) {
                    case 1:
                        animalService.addATerrestrialCarnivorous();
                        break;
                    case 2:
                        animalService.getAllTerrestrialCarnivorous();
                        break;
                    case 3:
                        animalService.addATerrestrialNonCarnivorous();
                        break;
                    case 4:
                        animalService.getAllTerrestrialNonCarnivorous();
                        break;
                    default:
                        break;
                }
            } else if (num == 3) {
                System.exit(0);
                break;
            }
        }
    }
}