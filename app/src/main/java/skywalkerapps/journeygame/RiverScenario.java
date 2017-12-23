package skywalkerapps.journeygame;

/**
 * First of many scenarios
 * This scenario brings the character to
 * a river crossing where he/she has to make choices
 * and those choices will ultimately impact their future
 *
 * Created by Luke Moua
 * on 12/22/2017.
 */

public class RiverScenario implements ScenarioInterface {

    //Implement the nameOfScenario() method so that it returns the scene name
    @Override
    public String nameOfScenario() {
        String sceneName = "River Crossing";
        return sceneName;
    }

    //Implement the explainScenario() method so that it returns the scenario description
    @Override
    public String explainScenario() {
        String explanation = "You come across a river. You need to get to the other side," +
                " what do you do?....";
        return explanation;
    }
    //Implement the choiceOne() method so that it returns the choices(in-text)
    //that the player has to make/ player sees these as text on buttons on screen
    @Override
    public String choiceOne() {
        String doThisOne = "A) Swim through it";
        return doThisOne;
    }

    @Override
    public String choiceTwo() {
        String doThisTwo = "B) Find another way to cross";
        return doThisTwo;
    }

    @Override
    public String choiceThree() {
        String doThisThree = "C) Build a boat";
        return doThisThree;
    }

    @Override
    public String choiceFour() {
        String doThisFour = "D) Go back home";
        return doThisFour;
    }
}