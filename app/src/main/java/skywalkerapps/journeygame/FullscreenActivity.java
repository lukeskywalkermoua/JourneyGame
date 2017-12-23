package skywalkerapps.journeygame;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

import java.util.Random;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class FullscreenActivity extends AppCompatActivity {

        //My random number that will be used to randomly
        //pick scenarios and results
        public int myRandomNum;

        private int randomNumRange;

        //Time that homescreen displays for
        private static int SPASH_TIME_OUT = 5000;

        //When the app is being created, it runs this first
        @Override
        protected void onCreate (Bundle savedInstanceState){

            super.onCreate(savedInstanceState);

            setContentView(R.layout.activity_fullscreen);

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent homeIntent = new Intent(FullscreenActivity.this, HomeActivity.class);
                    startActivity(homeIntent);
                    //finish() goes back one activity page after showing screen for SPASH_TIME_OUT milliseconds
                    finish();
                }
            }, SPASH_TIME_OUT);
        }

        //This method generates a random number for picking the scenarios
        //and decides the fate of the player

    public void generate(View view) {
        Random rand = new Random();
        //Takes in a random number range that will vary
        //According to number of choices and scenarios 0 to (randomNumRange - 1)
        int myRandomNum = rand.nextInt(randomNumRange);
    }
}

