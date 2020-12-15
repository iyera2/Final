import java.util.Scanner;
import java.io.*;

public class MedivalTimes{
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        boolean isRunning = true;
        while(isRunning){
            createMenu();
            int input = scan.nextInt();
            switch(input){
                case 1:
                    System.out.println("File Name");
                    String fileName = scan.nextLine();
                    PrintWriter output = new PrintWriter(fileName);
                    File file = new File(fileName);
                    System.out.println("Enter Game Name");
                    String name = scan.nextLine().trim();
                    System.out.println("Enter knight, peasant, cleric, mage, or courtier(NO REPEATS): ");
                    Character char1 = new Character(scan.nextLine());
                    System.out.println("Enter knight, peasant, cleric, mage, or courtier(NO REPEATS): ");
                    Character char2 = new Character(scan.nextLine());
                    System.out.println("Enter knight, peasant, cleric, mage, or courtier(NO REPEATS): ");
                    Character char3 = new Character(scan.nextLine());
                    System.out.println("Enter knight, peasant, cleric, mage, or courtier(NO REPEATS): ");
                    Character char4 = new Character(scan.nextLine());
                    System.out.println("Enter knight, peasant, cleric, mage, or courtier(NO REPEATS): ");
                    Character char5 = new Character(scan.nextLine());
                    GameCharacter finalgame = new GameCharacter(name, char1, char2, char3, char4, char5);
                case 2:

                case 3:

                case 4:
                    isRunning = false;
                    System.out.println("Quitting");
                    scan.close();
                    break;
            }
        }
    }

    private static void createMenu() {
        System.out.println("Options of the Menu");
        System.out.println("Creating a New Game(1)");
        System.out.println("Validating a Saved Game(2)");
        System.out.println("Reroll(3)");
        System.out.println("Quit(4)");
    }
}