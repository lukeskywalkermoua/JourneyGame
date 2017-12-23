package skywalkerapps.journeygame;

/**
 * Another scenario where the player is forced
 * to either approach a stranger on their journey
 * or turn away an opportunity
 *
 * Created by Luke Moua
 * 12/22/2017.
 */

public class StrangerScenario implements ScenarioInterface {
    //Implement the nameOfScenario() method so that it returns the scene name
    @Override
    public String nameOfScenario() {
        String sceneName = "Stranger In The Distance";
        return sceneName;
    }

    //Implement the explainScenario() method so that it returns the scenario description
    @Override
    public String explainScenario() {
        String explanation = "You see what looks like a stranger in the distance, what do you do?....";
        return explanation;
    }
    //Implement the choiceOne() method so that it returns the choices(in-text)
    //that the player has to make/ player sees these as text on buttons on screen
    @Override
    public String choiceOne() {
        String doThisOne = "A) Get their attention, you need help";
        return doThisOne;
    }

    @Override
    public String choiceTwo() {
        String doThisTwo = "B) Ignore them, sneak away";
        return doThisTwo;
    }

    @Override
    public String choiceThree() {
        String doThisThree = "C) Fire your gun at them";
        return doThisThree;
    }

    @Override
    public String choiceFour() {
        String doThisFour = "D) Go back home";
        return doThisFour;
    }
}
