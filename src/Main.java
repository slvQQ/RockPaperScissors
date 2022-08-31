import java.util.Random;
import java.util.Scanner;

public class Main {

    String getComputerChoice() {

        String computerChoice;
        int randomNumber = (int) (Math.random() * 3 + 1);

        if (randomNumber == 1) {

            computerChoice = "rock";
        } else if (randomNumber == 2) {

            computerChoice = "paper";
        } else {

            computerChoice = "scissors";
        }

        return computerChoice;
    }

    String getUserInput() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter rock, paper, or scissors");
        String userInput = input.nextLine();

        userInput = userInput.toLowerCase();

        return userInput;

    }

    String getResult(String userInput, String computerChoice) {


            if (userInput.equals(computerChoice)) {

                return "draw";

            } else if (userInput.equals("paper") && computerChoice.equals("rock")) {


                return "user wins";
            } else if (userInput.equals("rock") && computerChoice.equals("scissors")) {


                return "user wins";
            } else if (userInput.equals("scissors") && computerChoice.equals("paper")) {


                return "user wins";
            } else {

                return "Computer wins";
            }

    }



    public static void main(String[] args) {
	// write your code here

        Main obj = new Main();

        String computerChoice = obj.getComputerChoice();
        String userInput = obj.getUserInput();
        String result = obj.getResult(userInput, computerChoice);

        System.out.println("User's choice: " + userInput);
        System.out.println("Computer's choice: " + computerChoice);
        System.out.println(result);


    }
}
