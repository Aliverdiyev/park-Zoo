package util;

import service.AnimalService;

import java.util.Scanner;

public class MenuUtil {

    private MenuUtil() {
        throw new IllegalStateException("Utility class");
    }

    static AnimalService animalService = new AnimalService();

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Hello, welcome to PARK-ZOO!");
            String textBlock = """
                    Select the category you are interested in!
                    1 -> Aquatic
                    2 -> Terrestrial
                    3 -> Exit the system
                    """;
            System.out.println(textBlock);
            int num = sc.nextInt();
            sc.nextLine();
            if (num == 1) {
                String textBlockForAquatic = """
                        1 -> to add aquatic carnivorous
                        2 -> to see a list of aquatic carnivores
                        3 -> to add aquatic non-carnivorous
                        4 -> to see a list of aquatic non-carnivores
                        """;
                System.out.println(textBlockForAquatic);
                int aquaticCategory = sc.nextInt();
                sc.nextLine();
                switch (aquaticCategory) {
                    case 1:
                        animalService.addAquaticCarnivorous(sc);
                        break;
                    case 2:
                        animalService.getAllAquaticCarnivorous();
                        break;
                    case 3:
                        animalService.addAquaticNonCarnivorous(sc);
                        break;
                    case 4:
                        animalService.getAllAquaticNonCarnivorous();
                        break;
                    default:
                        break;
                }
            } else if (num == 2) {
                String textBlockForTerrestrial = """
                        1 -> to add terrestrial carnivorous
                        2 -> to see a list of terrestrial carnivores
                        3 -> to add terrestrial non-carnivorous
                        4 -> to see a list of terrestrial non-carnivores
                        """;
                System.out.println(textBlockForTerrestrial);
                int terrestrialCategory = sc.nextInt();
                sc.nextLine();
                switch (terrestrialCategory) {
                    case 1:
                        animalService.addATerrestrialCarnivorous(sc);
                        break;
                    case 2:
                        animalService.getAllTerrestrialCarnivorous();
                        break;
                    case 3:
                        animalService.addATerrestrialNonCarnivorous(sc);
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