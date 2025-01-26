import java.util.InputMismatchException;
import java.util.Scanner;

public class Scene {

    Scanner scan = new Scanner(System.in);
    Inventory inventory = new Inventory();

    private int choice;
    private String player;

    public void FirstDecision(){
        if(choice == 1){
            SecondUniqueSceneA();
        } else if (choice == 2) {
            SecondUniqueSceneEnd();
        } else if (choice == 3) {
            SecondUniqueSceneEnd();
        }
    }

    public void FinalDecision(){
        if(choice == 1){
            ThirdUniqueSceneEnd();
        } else if (choice == 2) {

        } else if (choice == 3) {
            ThirdUniqueSceneEnd();
        }    }
    public void StartGame(){
        System.out.println("Welcome to the adventure");
        System.out.println("Select an option and advance to find the safe route. Good Luck!");
        System.out.println("Press any button and enter to continue");
        scan.nextLine();
    }

    public void CommonScene(){
        System.out.println("Your character wonders if the decision was the correct one...");
        System.out.println("Press any button and enter to continue");
        scan.next();
    }

    public void FirstUniqueScene(){
        System.out.println("You find yourself on a cliff next to the sea");
        System.out.println("There's nowhere to run and 2 wolves are coming from the front");
        System.out.println("What do you do: ");
        System.out.println("1. Jump off the cliff");
        System.out.println("2. Fight the wolves");
        System.out.println("3. Stay Still");
        System.out.println("Select the number of your decision and press enter to continue.");

        do{
            try{
                choice = scan.nextInt();
            }catch (InputMismatchException inputMismatchException){
                System.out.println("Please select a valid number: ");
                scan.nextLine();
            }
        }while(choice < 1 || choice > 3);

        switch (choice){
            case 1:
                System.out.println("You Jump...");
                break;
            case 2:
                System.out.println("You Fight...");
                break;
            case 3:
                System.out.println("You stay still...");
                break;
            default:
                System.out.println("Invalid decision");
                break;
        }
    }

    public void SecondUniqueSceneEnd(){
        if(choice == 2){
            System.out.println("You fought the wolves fearlessly, and won by killing them both, but the injuries suffered take away your life... ");
        }else if(choice == 3){
            System.out.println("You freeze on the spot thinking they might not attack you, they maul you to death...");
        }
    }

    public void SecondUniqueSceneA(){
        System.out.println("You survived the jump, you were thrown ashore on an island");
        System.out.println("After searching your surroundings you find a knife, would you like to keep it?");
        System.out.println("Y / N");

        player = scan.next();

        if(player.equals("Y")){
            inventory.addToInventory("Knife");
        }else{
            System.out.println("You throw away the knife");
            CommonScene();
        }

        inventory.showInventory();

        System.out.println("You suddenly hear people shouting and running on your way, you have the right amount of time to:");
        System.out.println("1.Shout so you can meet with them");
        System.out.println("2.Hide");
        System.out.println("3.Run on the opposite direction in an attempt to get as far away as possible");
        System.out.println("Select the number of your decision and press enter to continue.");

        do{
            try{
                choice = scan.nextInt();
            }catch (InputMismatchException inputMismatchException){
                System.out.println("Please select a valid number: ");
                scan.nextLine();
            }
        }while(choice < 1 || choice > 3);

        switch (choice){
            case 1:
                System.out.println("You Shout...");
                break;
            case 2:
                System.out.println("You Hide...");
                break;
            case 3:
                System.out.println("You Run...");
                break;
            default:
                System.out.println("Invalid decision");
                break;
        }
    }

    public void ThirdUniqueSceneEnd(){
        if(choice == 1 && inventory.inventoryList.contains("Knife")){
            System.out.println("You shout and some tribemen hear your voice, they approach you carefully but seeing the knife you carry, makes one of them panic killing you on the spot by shooting an arrow... ");
        }else if(choice == 1){
            System.out.println("You shout and some tribemen hear your voice, they approach you carefully, seeing you are harmeless they take you back to their tribe and accept you as one of their own. You survived");
        }else if(choice == 2){
            System.out.println("You hide yourself inside a nearby cave you see, the voices dim little by little until they dissapear, you decide to leave your hiding spot but as you are about to a snake you handn't seen bites you, you leave the cave and see a triangle head shaped snake. Your time left alive can be considered a countdown now...");
        } else if (choice == 3) {
            System.out.println("You start running, unfortunately you fall in a booby trap, theres no time to react and you die instantly... ");
        }
    }

}
