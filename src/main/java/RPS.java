import java.util.List;
import java.util.ArrayList;

public class RPS {
  public String determineWinner(String player1, String player2) {
    String result = "";
    if ( (player1.equals("paper") && player2.equals("rock")) || (player1.equals("rock") && player2.equals("scissors")) || (player1.equals("scissors") && player2.equals("paper")) ) {
      result = "Player 1 Wins!";
    } else if ( (player2.equals("paper") && player1.equals("rock")) || (player2.equals("rock") && player1.equals("scissors")) || (player2.equals("scissors") && player1.equals("paper")) ) {
      result = "Player 2 Wins!";
    } else if ( player1.equals(player2) ) {
      result = "It's a tie!";
    }
    return result;
  }
}
