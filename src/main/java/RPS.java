import java.io.Console;
import java.util.Arrays;
import java.util.List;
//import static spark.Spark.*;
import java.util.Map;

public class RPS {
  public static void main(String[] args) {
    //get inpout from a form goes here later
  }

  public static String checkWinnerRockFirst(String playerOne, String playerTwo) {
    //String playerOne = resultOfButtonPush();

    //HashMap<String, String> rock = new Hashmap<String, String>();

    //rock.put("rock", "Tie!");
    //rock.put("paper", "Player Two!");
    //rock.put("scissors", "Player One!");


      if (playerOne == "rock") {
        if (playerTwo == "scissors") {
          System.out.println("Player One!");
        } else if (playerTwo == "paper") {
          System.out.println("Player Two!");
        } else System.out.println("Tie!");


      } return System.out.println();
   }
}
