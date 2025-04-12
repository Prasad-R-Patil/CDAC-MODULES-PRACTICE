import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<ISaveable> characters = new ArrayList<>();

        System.out.print("How many players do you want to add? ");
        int playerCount = scanner.nextInt();
        scanner.nextLine(); // consume newline

        for (int i = 0; i < playerCount; i++) {
            System.out.println("Enter details for Player " + (i + 1));
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Hit Points: ");
            int hitPoints = scanner.nextInt();

            System.out.print("Strength: ");
            int strength = scanner.nextInt();
            scanner.nextLine(); // consume newline

            System.out.print("Weapon: ");
            String weapon = scanner.nextLine();

            Player player = new Player(name, hitPoints, strength, weapon);
            characters.add(player);
        }

        System.out.print("How many monsters do you want to add? ");
        int monsterCount = scanner.nextInt();
        scanner.nextLine(); // consume newline

        for (int i = 0; i < monsterCount; i++) {
            System.out.println("Enter details for Monster " + (i + 1));
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Hit Points: ");
            int hitPoints = scanner.nextInt();

            System.out.print("Strength: ");
            int strength = scanner.nextInt();
            scanner.nextLine(); // consume newline

            Monster monster = new Monster(name, hitPoints, strength);
            characters.add(monster);
        }

        System.out.println("\nAll Character Details:");
        for (ISaveable character : characters) {
            System.out.println(character.toString());
        }

        scanner.close();
    }
}
