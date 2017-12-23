package skywalkerapps.journeygame;

/**
 * Created by Student on 12/22/2017.
 */

public class StartScenario implements ScenarioInterface {
    //Implement the nameOfScenario() method so that it returns the scene name
    @Override
    public String nameOfScenario() {
        String sceneName = "The Beginning";
        return sceneName;
    }

    //Implement the explainScenario() method so that it returns the scenario description
    @Override
    public String explainScenario() {
        String explanation = "You wake up from a hospital bed, the hospital is empty, " +
                "nobody is around, what do you do?...";
        return explanation;
    }
    //Implement the choiceOne() method so that it returns the choices(in-text)
    //that the player has to make/ player sees these as text on buttons on screen
    @Override
    public String choiceOne() {
        String doThisOne = "A) Find someone to help";
        return doThisOne;
    }

    @Override
    public String choiceTwo() {
        String doThisTwo = "B) Find a weapon";
        return doThisTwo;
    }

    @Override
    public String choiceThree() {
        String doThisThree = "C) Look for clues";
        return doThisThree;
    }

    @Override
    public String choiceFour() {
        String doThisFour = "D) Go back to sleep";
        return doThisFour;
    }
}
