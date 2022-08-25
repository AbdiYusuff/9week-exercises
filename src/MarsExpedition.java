import java.util.Scanner;
public class MarsExpedition {
    //Create another Java file in src called MarsExpedition

    //Within public class MarsExpedition create
    // a public MarsExpedition constructor
    public MarsExpedition() {

//        Create a new Scanner variable named input, this will be what you use to store the user input
        Scanner input = new Scanner(System.in);

//        Print “Expedition prep program starting…”
        System.out.println("Expedition prep program starting");
//
//        Print “Booting up…”
        System.out.println("Booting up");
//
//        Print “…”
        System.out.println("...");
//
//        Print “…”
        System.out.println("...");
//
//        Print “…”
        System.out.println("...");
//
//        Print “Ready”
        System.out.println("Ready");

//        Print “Hello user. What is your name?”
        System.out.println("Hello user. What is your name?");
//
//        Create a new String variable named name which is set equal to input.nextLine()
        String name = input.nextLine();
//
//        Print “Hi, name — Welcome to the Expedition prep program.n Are you ready to head out into the new world?n Type Y or N”
        System.out.println("Hi, " + name + "Welcome to the Expedition program.\n");
        System.out.println("Are you ready head out into the new world? \n");
        System.out.println("Type Y or N \n");
//
//        Create a new String variable called excited which is set equal to input.nextLine()
        String excited = input.nextLine();
//
//        Create an if statement that checks if excited is equal to Y ignoring case

        int teamSize = 0;
        if (excited == "Y") {
            //Print “I knew you would say that. You are team leader for a reason.”
            System.out.println("I knew you would say that. You are team leader for a reason.");
        }
        //        Use an else statement for everything else
        else {
            //Print “To bad you are team leader. You have to go.”
            System.out.println("To bad you are team leader. You have to go.");

            //        Print “How many people do you want on your expedition team? (Input an int number)”

            System.out.println("How many people do you want on your expedition team? (Input an int number)");

            //        Create a new int variable named teamSize and set it equal to input.nextInt()
            teamSize = input.nextInt();

            //        You need to use input.nextLine() to correct the location of the scanner after using nextInt()
            input.nextLine();

            //        Use an if statement to check if teamSize is greater than 2
            if (teamSize > 2) {
                //        Print “That’s way to many people.
                System.out.println("That is way to many people!");
                //        We can only send 2 more members.”
                //        Set teamSize equal to 2
                teamSize = 2;
            }

            //        Use an else-if statement to check if teamSize is less than 2
            //        Print “That’s not enough people.
            else if (teamSize < 2) {
                //We need you and 2 more members.” Set teamSize equal to 2
                System.out.println("We need you and 2 more members");
                teamSize = 2;
            } else {
                //        Print “That’s a perfect sized team. Good job.”
                System.out.println("That’s a perfect sized team. Good job.");
            }

        }

//        Print “You are allowed to bring one weapon with you. You know, just incase. What do you want to bring?”
        System.out.println("You are allowed to bring one weapon with you. You know, just in case. What do you want to bring?");
//
//        Create a String variable called weapon and set it equal to input.nextInt()
        String weapon = input.nextLine();
//
//        Print “Nice choice, you will be bringing a weapon with you.”
        System.out.println("Nice choice, you will be bringing a weapon with you.");
//
//        Print “You have the choice of 3 vehicles” “nA: A Mars Rover” “nB: A Chevy Silverado” “nC: A Honda Civic”
        System.out.println("\nA: A Mars Rover");
        System.out.println("\nB: A Chevy Silverado");
        System.out.println("\nC: A Honda Civic");
//
//        Create a String variable named vehicleChoice and set it equal to input.nextLine()
        String vehicleChoices = input.nextLine();
        String vehicle;
//
//        Use an if statement to check if vehicleChoice is equal to A ignoring case Create
//        a new String variable called vehicle and set it equal to “Mars Roover”
        if (vehicleChoices.equalsIgnoreCase("A")) {
            vehicle = "Mars Roover";

        }
//        Use an else if statement to check if vehicleChoice is equal to B ignoring case Create
//        a new String variable called vehicle and set it equal to “Chevy Silverado”
        else if (vehicleChoices.equalsIgnoreCase("B")) {
            vehicle = "Chevy Silverado";
        }
//        Use an else if statement to check if vehicleChoice is equal to C ignoring case Create
//        a new String variable called vehicle and set it equal to “Honda Civic”
        else if (vehicleChoices.equalsIgnoreCase("C")) {
            vehicle = "Honda Civic";

        }
//        Use an else statement for if vehicleChoice does not equal any of the above Create
//        a new String variable called vehicle and set it equal to “your feet”
        else {
            vehicle = "your feet";
        }
        //
        //        Print “Your expedition team is now ready”
        //        “nLed by name with teamSize teammates.”

        //        “nTo explore the surface of Mars using vehicle.”
        //        “nExploration team heads out in”
        //        “n5….”
        //        “n4….”
        //        “n3….”
        //        “n2….”
        //        “n1….”
        //        “nGO GO GO!”
        System.out.println("Your expedition team is now ready" +
                "\nLed by " + name + " with " + teamSize + " teammates." +
                "\nTo explore the surface of Mars using " + vehicle + "." +
                "\nExploration team heads out in" +
                "\n5...." +
                "\n4...." +
                "\n3...." +
                "\n2...." +
                "\n1...." +
                "\nGO GO GO!");


    }


}



