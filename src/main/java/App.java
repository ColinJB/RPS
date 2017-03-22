import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Console userConsole = System.console();
    boolean programRunning = true;
    while (programRunning) {
      System.out.println("Welcome to Rock, Paper, Scissors! To begin; Player 1 please enter your choice of either rock, paper, or scissors. Then, look away from the screen as Player 2 enters their choice. No peeking!!");
      System.out.println("Player 1; please enter your choice.");
      String player1Choice = userConsole.readLine();
      System.out.println("Player 2; please enter your choice.");
      String player2Choice = userConsole.readLine();
      RPS rps = new RPS();
      String rpsResult = rps.determineWinner(player1Choice, player2Choice);
      System.out.println(rpsResult);
    }
  }
}
