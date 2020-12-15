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
                    System.out.println("Name your character:");
                    String char1name = scan.nextLine();
                    char1.setName(char1name);
                    System.out.println("Enter knight, peasant, cleric, mage, or courtier(NO REPEATS): ");
                    Character char2 = new Character(scan.nextLine());
                    System.out.println("Name your 2nd character:");
                    String char2name = scan.nextLine();
                    char2.setName(char2name);
                    System.out.println("Enter knight, peasant, cleric, mage, or courtier(NO REPEATS): ");
                    Character char3 = new Character(scan.nextLine());
                    System.out.println("Name your 3rd character:");
                    String char3name = scan.nextLine();
                    char3.setName(char3name);
                    System.out.println("Enter knight, peasant, cleric, mage, or courtier(NO REPEATS): ");
                    Character char4 = new Character(scan.nextLine());
                    System.out.println("Name your 4th character:");
                    String char4name = scan.nextLine();
                    char4.setName(char4name);
                    System.out.println("Enter knight, peasant, cleric, mage, or courtier(NO REPEATS): ");
                    Character char5 = new Character(scan.nextLine());
                    System.out.println("Name your 5th character:");
                    String char5name = scan.nextLine();
                    char5.setName(char5name);
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