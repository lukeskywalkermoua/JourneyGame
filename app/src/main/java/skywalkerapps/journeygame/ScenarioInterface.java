package skywalkerapps.journeygame;

/**
 * Interface that holds the
 * main methods in all of the scenarios
 * in the game. Will be implemented by specfic scenario
 * classes
 *
 * Created by Luke Moua
 * 12/22/2017.
 */

public interface ScenarioInterface {

    //Returns the name of the current scenario
    String nameOfScenario();

    //Describe the current scenario to the player
    String explainScenario();

    //Returns the choice(in-text) that the
    //player has to make, as of now there are four choices
    String choiceOne();
    String choiceTwo();
    String choiceThree();
    String choiceFour();



}
