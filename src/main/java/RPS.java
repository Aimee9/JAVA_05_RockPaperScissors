import java.io.Console;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import static spark.Spark.*;
import java.util.Map;
import java.util.HashMap;
//import velocity:
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import java.util.Random;



public class RPS {

  public static void main(String[] args) {
    get("/form", (request, response) -> {
      HashMap model = new HashMap();

      model.put("template", "templates/form.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    List<String> choices = new ArrayList<String>();
    list.add("rock");
    list.add("paper");
    list.add("scissors");

    Random result = new Random();
  }






  public String getRandomResult(List<String> choices) {
      int index = result.nextInt(choices.size());
      String playerTwo = choices.get(index);
      }

  public static String checkWinnerRockFirst(String playerOne, String playerTwo) {


    HashMap<String, String> rock = new HashMap<String, String>();

    rock.put("rock", "Tie!");
    rock.put("paper", "Player Two!");
    rock.put("scissors", "Player One!");

    HashMap<String, String> paper = new HashMap<String, String>();

    paper.put("paper", "Tie!");
    paper.put("scissors", "Player Two!");
    paper.put("rock", "Player One!");

    HashMap<String, String> scissors = new HashMap<String, String>();

    scissors.put("scissors", "Tie!");
    scissors.put("rock", "Player Two!");
    scissors.put("paper", "Player One!");
    if (playerOne == "rock") {

    } return rock.get(playerTwo);


  }
}
