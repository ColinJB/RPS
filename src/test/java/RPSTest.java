import org.junit.*;
import static org.junit.Assert.*;

public class RPSTest {

  @Test
  public void determineWinner_determinePlayer1WinnerOfPaperVsRock_string() {
    RPS testRPS = new RPS();
    String expected = "Player 1 Wins!";
    assertEquals(expected, testRPS.determineWinner("paper", "rock"));
  }

  @Test
  public void determineWinner_determinePlayer2WinnerOfPaperVsRock_string() {
    RPS testRPS = new RPS();
    String expected = "Player 2 Wins!";
    assertEquals(expected, testRPS.determineWinner("rock", "paper"));
  }

  @Test
  public void determineWinner_determinePlayer1WinnerOfRockVsScissors_string() {
    RPS testRPS = new RPS();
    String expected = "Player 1 Wins!";
    assertEquals(expected, testRPS.determineWinner("rock", "scissors"));
  }

  @Test
  public void determineWinner_determinePlayer2WinnerOfRockVsScissors_string() {
    RPS testRPS = new RPS();
    String expected = "Player 2 Wins!";
    assertEquals(expected, testRPS.determineWinner("scissors", "rock"));
  }

  @Test
  public void determineWinner_determinePlayer1WinnerOfScissorsVsPaper_string() {
    RPS testRPS = new RPS();
    String expected = "Player 1 Wins!";
    assertEquals(expected, testRPS.determineWinner("scissors", "paper"));
  }

  @Test
  public void determineWinner_determinePlayer2WinnerOfScissorsVsPaper_string() {
    RPS testRPS = new RPS();
    String expected = "Player 2 Wins!";
    assertEquals(expected, testRPS.determineWinner("paper", "scissors"));
  }

  @Test
  public void determineWinner_determineTie_string() {
    RPS testRPS = new RPS();
    String expected = "It's a tie!";
    assertEquals(expected, testRPS.determineWinner("paper", "paper"));
    assertEquals(expected, testRPS.determineWinner("rock", "rock"));
    assertEquals(expected, testRPS.determineWinner("scissors", "scissors"));
  }
}
