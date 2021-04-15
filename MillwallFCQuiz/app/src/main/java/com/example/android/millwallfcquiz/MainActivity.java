package com.example.android.millwallfcquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //the Max score if all questions are correct
    final int maxScore = 10;

    RadioGroup rg_champions;

    // list of variables of scores that need to be global.
    // a note of local variables is also made
    int scoreForOne = 0;
    int scoreForTwo = 0;
    // Score for Three is defined local
    int scoreForFour = 0;
    // Score For Six defined local
    int scoreForFive = 0;
    int scoreForSeven = 0;
    // Score For Eight defined local
    // Score For Nine  defined local
    int scoreForTen = 0;

    /*
        // Question 3 variable
        // These are used to compare with the text entered.
     */
    EditText questionThreeNickName;
    String answerThreeTheLions = "THE LIONS";
    String answerThreeLions = "LIONS";

    /*
        // Question Nine Strings of the correct answer
        // These are used to compare with the text entered.
     */
    EditText questionNineEditText;
    String answerNineTheDen = "THE DEN";
    String answerNineDen = "DEN";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /*
        // RadioGroup for question One
        // Question?
        // How many times have Millwall FC won their respective league?
        // correct answer? 5 rb_champ_5
     */
    public void onRgChampionsClicked(View view) {
        // score for this answer is set to zero
        scoreForOne = 0;

        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        // Only the correct id is looked for
        switch (view.getId()) {
            case R.id.rb_champ_5:
                if (checked)
                    // Correct score increased
                    scoreForOne = 1;
                break;
        }
    }

    /*
        // RadioGroup for question Two
        // Question?
        // How many times has Millwall FC been promoted to a higher league?
        //  CHECK THIS correct answer? 5 rb_champ_5
     */
    public void onRgPromtedClicked(View view) {
        // score for this answer is set to zero
        scoreForTwo = 0;

        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        // Only the correct id is looked for
        switch (view.getId()) {
            //Check how many times?1?!?
            case R.id.radio_promted_11:
                if (checked)
                    // Correct score increased
                    scoreForTwo = 1;
                break;
        }

    }

    /*
       // RadioGroup for question Three
       // Question?
       // What is Millwall’s nickname? Lions / The Lion
       // correct answer? Lions / The Lion
    */
    public int isQuestionThreeCorrect(View view) {
        questionThreeNickName = findViewById(R.id.edit_text_nick_name);
        String answerThree = questionThreeNickName.getText().toString().trim().toUpperCase();

        // Set the variable used to track the score for Nine to 0

        // If statement to see if the we have the right answer for Question Nine
        if (answerThree.equals(answerThreeTheLions)) {

            return 1;
        } else if (answerThree.equals(answerThreeLions)) {

            return 1;
        } else {
            return 0;
        }
    }

    /*
      // RadioGroup for question Four
      // Question?
      // Which Team is Millwall’s major rivalry with? West Ham
      // correct answer? West Ham
   */
    public void onRgRivalryClicked(View view) {
        // score for this answer is set to zero
        scoreForFour = 0;

        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        // Only the correct id is looked for
        switch (view.getId()) {
            //Check how many times?1?!?
            case R.id.radio_rivalry_west_ham:
                if (checked)
                    // Correct score increased
                    scoreForFour = 1;
                break;
        }
    }

    /*
      // RadioGroup for question Five
      // Question?
      // How many Times has Millwall FC been relegated? 9
      // correct answer? 9
   */
    public void onRgRelegatedClicked(View view) {
        // score for this answer is set to zero
        scoreForFive = 0;

        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        // Only the correct id is looked for
        switch (view.getId()) {
            //Check how many times?1?!?
            case R.id.radio_relegated_9:
                if (checked)
                    // Correct score increased
                    scoreForFive = 1;
                break;
        }
    }

    /*
    // Code for question 6
    // Question?
    // What is the name of the ground / stadium Millwall play at? The Den / Den6
    // correct answer? "THE DEN" / "DEN"
*/
    public int isQuestionSixCorrect() {
        /*
            // question 6 checked
            // check boxes
         */
        // check box 1 IS correct
        CheckBox qSixCheckBoxOne = findViewById(R.id.q6_check_box_1_blue);
        boolean isQSixCheckedOne = qSixCheckBoxOne.isChecked();

        // check box 2
        CheckBox qSixCheckBoxTwo = findViewById(R.id.q6_check_box_2);
        boolean isQSixCheckedTwo = qSixCheckBoxTwo.isChecked();

        // check box 3 IS correct
        CheckBox qSixCheckBoxThree = findViewById(R.id.q6_check_box_3_white);
        boolean isQSixCheckedThree = qSixCheckBoxThree.isChecked();

        // check box 4
        CheckBox qSixCheckBoxFour = findViewById(R.id.q6_check_box_4);
        boolean isQSixCheckedFour = qSixCheckBoxFour.isChecked();

        // Checks that the two correct checkboxes are checked
        // and
        // The two wrong boxes are unchecked.
        if ((isQSixCheckedOne && isQSixCheckedThree) && (!isQSixCheckedTwo && !isQSixCheckedFour)) {
            return 1;
        }
        return 0;

    }

    /*
     // RadioGroup for question Seven
     // Question?
     // What year was Millwall founded? 1885
     // correct answer? 1885 radio_founded_3
  */
    public void onRgFoundedClicked(View view) {
        // score for this answer is set to zero
        scoreForSeven = 0;
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        // Only the correct id is looked for
        switch (view.getId()) {
            //Check how many times?1?!?
            case R.id.radio_founded_3:
                if (checked)
                    // Correct score increased
                    scoreForSeven = 1;
                break;
        }
    }

    /*
        // Is question 8 correct?
     */
    public int isQuestionEightCorrect() {
        /*
            // question 8 checked
            // check boxes
         */
        // check box 1 IS correct
        CheckBox qEightCheckBoxOne = findViewById(R.id.q8_check_box_1);
        boolean isQEightCheckedOne = qEightCheckBoxOne.isChecked();

        // check box 2
        CheckBox qEightCheckBoxTwo = findViewById(R.id.q8_check_box_2);
        boolean isQEightCheckedTwo = qEightCheckBoxTwo.isChecked();

        // check box 3 IS correct
        CheckBox qEightCheckBoxThree = findViewById(R.id.q8_check_box_3);
        boolean isQEightCheckedThree = qEightCheckBoxThree.isChecked();

        // check box 4
        CheckBox qEightCheckBoxFour = findViewById(R.id.q8_check_box_4);
        boolean isQEightCheckedFour = qEightCheckBoxFour.isChecked();

        // Checks that the two correct checkboxes are checked
        // and
        // The two wrong boxes are unchecked.
        if ((isQEightCheckedOne && isQEightCheckedThree) && (!isQEightCheckedTwo && !isQEightCheckedFour)) {
            return 1;
        }
        return 0;

    }


    /*
// Code for question 9
// Question?
// What is the name of the ground / stadium Millwall play at? The Den / Den6
// correct answer? "THE DEN" / "DEN"
*/
    public int isQuestionNineCorrect(View view) {
        questionNineEditText = findViewById(R.id.edit_text_question_9);
        String answerNine = questionNineEditText.getText().toString().trim().toUpperCase();

        // Set the variable used to track the score for Nine to 0

        // If statement to see if the we have the right answer for Question Nine
        if (answerNine.equals(answerNineTheDen)) {
            // correct returns 1 to score
            return 1;
        } else if (answerNine.equals(answerNineDen)) {
            // correct returns 1 to score
            return 1;
        } else {
            // wrong, returns 0
            return 0;
        }
    }

    /*
 // RadioGroup for question Ten
 // Question?
 // What is the capacity of Millwall’s ground / stadium? 20,146
 // correct answer? 20,146
*/
    public void onRgCapacityClicked(View view) {
        // score for this answer is set to zero
        scoreForTen = 0;
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        // Only the correct id is looked for
        switch (view.getId()) {
            //Check how many times?1?!?
            case R.id.radio_capacity_2:
                if (checked)
                    // Correct, adds 1 to score
                    scoreForTen = 1;
                break;
        }
    }

    /*
        // The is checked and added up
        //
     */
    public void getResults(View view) {
        // isQuestionNineCorrect();
    /*
        // Get users name
     */
        EditText userNameEditText = findViewById(R.id.user_name);
        // stores user name in userName
        String userName = userNameEditText.getText().toString();


        /*
            // Get the results for questions 3
         */
        int scoreForThree = isQuestionThreeCorrect(questionThreeNickName);
         /*
            // Get the results for questions 6
         */
        int scoreForSix = isQuestionSixCorrect();
         /*
            // Get the results for questions 8
         */
        int scoreForEight = isQuestionEightCorrect();

         /*
            // Get the results for questions 9
         */
        int scoreForNine = isQuestionNineCorrect(questionNineEditText);

        // the user score is set to zero
        int finalScore = 0;
        // The user score is made by adding up the score from all question's score
        finalScore = scoreForOne + scoreForTwo + scoreForThree + scoreForFour
                + scoreForFive + scoreForSix + scoreForSeven
                + scoreForEight + scoreForNine + scoreForTen;

        // user's score and name is sent to make the results message
        String resultsMessage = getResultsMessage(finalScore, userName);

        // The results are printed here
        TextView results_textView = findViewById(R.id.results_textView);
        results_textView.setText(resultsMessage);
    }

    /*
        // The result message is made here before being sent back to the getResults method
        // @param finalScore is the total score the user has
        // @param name is the username entered in the app
     */
    public String getResultsMessage(int finalScore, String name) {

        String resultMessage = "";

        // The user has a score of 0
        if (finalScore == 0) {
            resultMessage = "Good Try " + name;
            // score higher than 0  and less than 5
        } else if ((finalScore > 0) && (finalScore < 5)) {
            resultMessage = "Good score " + name;
            // score higher than 4 but less than 10
        } else if ((finalScore > 4) && (finalScore < 10)) {
            resultMessage = "Great score " + name;
            //score is the same as the maximum possible score, set to 10
        } else if (finalScore == maxScore) {
            resultMessage = "Perfect score " + name;
        }

        // Return message gives their score out of the max score
        resultMessage += "\nYou got " + finalScore + " out of " + maxScore;
        // return message sent back
        return resultMessage;
    }

    /*
       // Reset the whole app
    */
    public void restQuiz(View view) {

        /*
            // Answer 1 reset
            // The whole radio group is cleared
         */
        RadioGroup radioGroupChampions = findViewById(R.id.rg_champions);
        radioGroupChampions.clearCheck();
        scoreForOne = 0;

        /*
            // Answer 2 reset
            // The whole radio group is cleared
         */
        RadioGroup radioGroupPromted = findViewById(R.id.rg_promted);
        radioGroupPromted.clearCheck();
        scoreForTwo = 0;

        /*
            // Answer 3 reset
         */
        EditText nickNameEditText = findViewById(R.id.edit_text_nick_name);
        nickNameEditText.setText("");

        /*
            // Answer 4 reset
            // The whole radio group is cleared
         */
        RadioGroup radioGroupRivalry = findViewById(R.id.rg_rivalry);
        radioGroupRivalry.clearCheck();
        //score set to zero
        scoreForFour = 0;

        /*
            // Answer 5 reset
            // The whole radio group is cleared
         */

        RadioGroup radioGroupRelegated = findViewById(R.id.rg_relegated);
        radioGroupRelegated.clearCheck();
        //score set to zero
        scoreForFive = 0;

        /*
            // Answer 6 reset
         */

        CheckBox qSixCheckBoxOne = findViewById(R.id.q6_check_box_1_blue);
        qSixCheckBoxOne.setChecked(false);

        // check box 2
        CheckBox qSixCheckBoxTwo = findViewById(R.id.q6_check_box_2);
        qSixCheckBoxTwo.setChecked(false);

        // check box 3 IS correct
        CheckBox qSixCheckBoxThree = findViewById(R.id.q6_check_box_3_white);
        qSixCheckBoxThree.setChecked(false);

        // check box 4
        CheckBox qSixCheckBoxFour = findViewById(R.id.q6_check_box_4);
        qSixCheckBoxFour.setChecked(false);

        /*
            // Answer 7 reset
            // The whole radio group is cleared
         */

        RadioGroup radioGroupFounded = findViewById(R.id.rg_founded);
        radioGroupFounded.clearCheck();
        //score set to zero
        scoreForSeven = 0;

        /*
            // Answer 8 reset
            // All checkboxes are set to unchecked
         */

        CheckBox qEightCheckBoxOne = findViewById(R.id.q8_check_box_1);
        qEightCheckBoxOne.setChecked(false);

        // check box 2
        CheckBox qEightCheckBoxTwo = findViewById(R.id.q8_check_box_2);
        qEightCheckBoxTwo.setChecked(false);

        // check box 3 IS correct
        CheckBox qEightCheckBoxThree = findViewById(R.id.q8_check_box_3);
        qEightCheckBoxThree.setChecked(false);

        // check box 4
        CheckBox qEightCheckBoxFour = findViewById(R.id.q8_check_box_4);
        qEightCheckBoxFour.setChecked(false);

        /*
            // Answer 9 reset
         */

        EditText questionNineEditText = findViewById(R.id.edit_text_question_9);
        questionNineEditText.setText("");

        /*
            // Answer 10 reset
            // The whole radio group is cleared
         */
        RadioGroup radioGroupCapacity = findViewById(R.id.rg_capacity);
        radioGroupCapacity.clearCheck();
        //score set to zero
        scoreForTen = 0;

        /*
            // Results cleared
         */

        TextView results_textView = findViewById(R.id.results_textView);
        // Text is from the string stored in strings.xml
        results_textView.setText(R.string.reults_holding_text);

        /*
            // User name Edit Text cleared
         */
        EditText userNameEditText = findViewById(R.id.user_name);
        userNameEditText.setText("");

        // Set focus to the top of the app so the user can enter their name
        userNameEditText.setFocusable(true);
        userNameEditText.requestFocus();
    }
}
