import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class MedivalTimes{
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        Scanner scan2;
        boolean isRunning = true;
        while(isRunning){
            createMenu();
            int input = scan.nextInt();
            switch(input){
                case 1:
                    // System.out.println("File Name");
                    // String fileName = scan.nextLine();
                    PrintWriter output = new PrintWriter("details.txt");
                    File file = new File("details.txt");
                    scan2 = new Scanner(file);
                    System.out.println("Enter Game Name");
                    String name = scan.next();
                    System.out.println("Enter knight, peasant, cleric, mage, or courtier(NO REPEATS): ");
                    Character char1 = new Character(scan.next());
                    System.out.println("Name your character:");
                    String char1name = scan.next();
                    char1.setName(char1name);
                    System.out.println("Enter knight, peasant, cleric, mage, or courtier(NO REPEATS): ");
                    Character char2 = new Character(scan.next());
                    System.out.println("Name your 2nd character:");
                    String char2name = scan.next();
                    char2.setName(char2name);
                    System.out.println("Enter knight, peasant, cleric, mage, or courtier(NO REPEATS): ");
                    Character char3 = new Character(scan.next());
                    System.out.println("Name your 3rd character:");
                    String char3name = scan.next();
                    char3.setName(char3name);
                    System.out.println("Enter knight, peasant, cleric, mage, or courtier(NO REPEATS): ");
                    Character char4 = new Character(scan.next());
                    System.out.println("Name your 4th character:");
                    String char4name = scan.next();
                    char4.setName(char4name);
                    System.out.println("Enter knight, peasant, cleric, mage, or courtier(NO REPEATS): ");
                    Character char5 = new Character(scan.next());
                    System.out.println("Name your 5th character:");
                    String char5name = scan.next();
                    char5.setName(char5name);
                    GameCharacter finalgame = new GameCharacter(name, char1, char2, char3, char4, char5);
                    break;
                case 2:
                    System.out.println("File Check Enter: ");
                    String fname = scan.next();
                    file = new File(fname);
                    Scanner scan3 = new Scanner(file);

                    boolean isErrous = false;
                    String string = scan.next(); //These variables suck but I couldn't come up anything better

                    if (string.indexOf(",") >= 0) {  
                        isErrous = true; }

                    while(scan3.hasNext()){
                        if(scan.nextLine().split(",").length != 7){
                            isErrous = true;
                        } else {
                            System.out.println("Your file is valid");
                        }
                    }

                    if(isErrous = true){
                        System.out.println("You file is wrong");
                    } else {
                        System.out.println("Your file is correct");
                    }
                case 3:
                    System.out.println("Which character do you want to redo(knight, peasant, cleric, mage, or courtier)");
                    Character char6 = new Character(scan.next());
                    char6.redo();
                    createMenu();
                    input = Integer.parseInt(scan.next());
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