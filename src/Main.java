import java.util.Random;
import java.util.Scanner;

public class Main {
    static final String ROCK = "rock";
    static final String PAPER="paper";
    static final String SCISSORS="scissors";
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Choose [r]ock, [p]aper or [s]cissors: ");
        String playerMove= scan.nextLine();
        if(playerMove.equals('r')|| playerMove.equals("rock")){
            playerMove=ROCK;
        }else if(playerMove.equals('p')|| playerMove.equals("paper")){
            playerMove=PAPER;

        }else if(playerMove.equals('s')|| playerMove.equals("scissors")){
            playerMove=SCISSORS;
        }else{
            System.out.println("Invalid Input.Try again...");
            return;
        }
        Random random= new Random();
        int computerRandomNumber= random.nextInt(3);
        String computerMovie="";

        switch(computerRandomNumber){
            case 0: computerMovie="rock"; break;
            case 1: computerMovie="paper"; break;
            case 2: computerMovie="scissors"; break;

        }
        System.out.printf("The computer chose %s.%n", computerMovie);

        if((playerMove.equals(ROCK)&& computerMovie.equals(SCISSORS))
                || playerMove.equals(PAPER) && computerMovie.equals(ROCK)
                || playerMove.equals(SCISSORS)&& computerMovie.equals(PAPER)){
            System.out.println("You win!.");
        } else if(playerMove.equals(ROCK)&& computerMovie.equals(PAPER)||
                playerMove.equals(PAPER)&& computerMovie.equals(SCISSORS)||
                playerMove.equals(SCISSORS)&& computerMovie.equals(ROCK)){
            System.out.println("You lose.");
        }else{
            System.out.println("This game was draw");
        }
    }
}