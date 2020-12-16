import java.util.Scanner;
import java.io.*;

public class MedivalTimes{
    //MAIN CLASS
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        Scanner scan2;
        //FUNCTION CALL
        createMenu();
        int input = scan.nextInt();
        while(input < 4 && input > 0){
            //PART 1
            if(input == 1 ){  
                File file = new File("details.txt");
                PrintWriter output = new PrintWriter(new FileWriter(file, true));
                scan2 = new Scanner(file);

                System.out.println("Enter Game Name");
                String name = scan.next();
                output.println(name);

                System.out.println("Enter knight, peasant, cleric, mage, or courtier(NO REPEATS): ");
                Character char1 = new Character(scan.next());
                System.out.println("Name your character:");
                String char1name = scan.next();
                char1.setName(char1name);
                output.println("GameName: " + name + " and Character Name: " + char1name);

                System.out.println("Enter knight, peasant, cleric, mage, or courtier(NO REPEATS): ");
                Character char2 = new Character(scan.next());
                System.out.println("Name your 2nd character:");
                String char2name = scan.next();
                char2.setName(char2name);
                output.println("GameName: " + name + " and Character Name: " + char2name);
                System.out.println("Enter knight, peasant, cleric, mage, or courtier(NO REPEATS): ");

                Character char3 = new Character(scan.next());
                System.out.println("Name your 3rd character:");
                String char3name = scan.next();
                char3.setName(char3name);
                output.println("GameName: " + name + " and Character Name: " + char3name);

                System.out.println("Enter knight, peasant, cleric, mage, or courtier(NO REPEATS): ");
                Character char4 = new Character(scan.next());
                System.out.println("Name your 4th character:");
                String char4name = scan.next();
                char4.setName(char4name);
                output.println("GameName: " + name + " and Character Name: " + char4name);

                System.out.println("Enter knight, peasant, cleric, mage, or courtier(NO REPEATS): ");
                Character char5 = new Character(scan.next());
                System.out.println("Name your 5th character:");
                String char5name = scan.next();
                char5.setName(char5name);
                output.println("GameName: " + name + " and Character Name: " + char5name);

                output.close();
                //PART 2
            } else if(input == 2){
                System.out.println("File Check Enter: ");
                String fname = scan.next();
                File file = new File(fname);
                Scanner scan3 = new Scanner(file);

                boolean isErrous = false;
                String string = scan.next(); 

                if (string.indexOf(",") >= 0) {  
                    isErrous = true; 
                } else {
                    isErrous = false;
                }

                while(scan3.hasNext()){
                    if(scan.nextLine().split(",").length != 7){
                        isErrous = true;
                } else {
                    isErrous = false;
                }                
            } 
            //PART 3
        } else if(input == 3){
            System.out.println("Which character do you want to redo(knight, peasant, cleric, mage, or courtier)");
            Character char6 = new Character(scan.next());
            char6.redo();
            createMenu();
            input = Integer.parseInt(scan.next());
            //PART 4
        } else if(input == 4){
            System.out.println("Quitting");
            scan.close();
            break;
    }
        }

        }

    //VOID FUNCTIONS
    private static void createMenu() {
        System.out.println("Options of the Menu");
        System.out.println("Creating a New Game(1)");
        System.out.println("Validating a Saved Game(2)");
        System.out.println("Reroll(3)");
        System.out.println("Quit(4)");
    }
}