// to run tests
import org.junit.*;
import static org.junit.Assert.*;

public class RPSTests {

  /*@Test
  public void checkWinner_rockBeatsScissors_playerOne() {
    RPS whoWins = new RPS();
    assertEquals("Player One!", whoWins.checkWinnerRockFirst("rock", "scissors"));
  }*/

  @Test
  public void checkWinner_rockBeatsScissors_tie() {
    RPS whoWins = new RPS();
    assertEquals("Tie!", whoWins.checkWinnerRockFirst("rock", "rock"));
  }

  }
