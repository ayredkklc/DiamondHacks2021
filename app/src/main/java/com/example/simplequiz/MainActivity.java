package com.example.simplequiz;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //buttons for choices 1-4
    Button btn_one, btn_two, btn_three, btn_four;

    TextView tv_question;
    private QuizQuestions question = new QuizQuestions();
    private String answer;

    private final int numberOfMistakesAllowed = 3;

    private int numberOfQuestions = question.questions.length;
    private int countMistakes = 0;
    private int currentQuestion = 0;
    private int questionsCorrect = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_one = (Button)findViewById(R.id.btn_one);
        btn_one.setOnClickListener(this);
        btn_two = (Button)findViewById(R.id.btn_two);
        btn_two.setOnClickListener(this);
        btn_three = (Button)findViewById(R.id.btn_three);
        btn_three.setOnClickListener(this);
        btn_four = (Button)findViewById(R.id.btn_four);
        btn_four.setOnClickListener(this);

        tv_question = (TextView)findViewById(R.id.tv_question);
        NextQuestion(currentQuestion++);

        // calling the action bar
        ActionBar actionBar = getSupportActionBar();

        // showing the back button in action bar
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_one:
                if(btn_one.getText().toString().equalsIgnoreCase(answer)){
                    Toast.makeText(MainActivity.this, "Correct!", Toast.LENGTH_SHORT).show();
                    questionsCorrect++;
                    NextQuestion(currentQuestion++);
                }else{
                    countMistakes++;
                    if (countMistakes == numberOfMistakesAllowed) {
                        GameOver();
                    } else {
                        String livesLeft = (numberOfMistakesAllowed - countMistakes) + " live(s) left";
                        Toast.makeText(MainActivity.this, livesLeft, Toast.LENGTH_SHORT).show();
                    }
                }
                break;

            case R.id.btn_two:
                if(btn_two.getText().toString().equalsIgnoreCase(answer)){
                    Toast.makeText(MainActivity.this, "Correct!", Toast.LENGTH_SHORT).show();
                    questionsCorrect++;
                    NextQuestion(currentQuestion++);
                }else{
                    countMistakes++;
                    if (countMistakes == numberOfMistakesAllowed) {
                        GameOver();
                    } else {
                        String livesLeft = (numberOfMistakesAllowed - countMistakes) + " live(s) left";
                        Toast.makeText(MainActivity.this, livesLeft, Toast.LENGTH_SHORT).show();
                    }
                }

                break;

            case R.id.btn_three:
                if(btn_three.getText().toString().equalsIgnoreCase(answer)){
                    Toast.makeText(MainActivity.this, "Correct!", Toast.LENGTH_SHORT).show();
                    questionsCorrect++;
                    NextQuestion(currentQuestion++);
                }else{
                    countMistakes++;
                    if (countMistakes == numberOfMistakesAllowed) {
                        GameOver();
                    } else {
                        String livesLeft = (numberOfMistakesAllowed - countMistakes) + " live(s) left";
                        Toast.makeText(MainActivity.this, livesLeft, Toast.LENGTH_SHORT).show();
                    }
                }
                break;

            case R.id.btn_four:
                if(btn_four.getText().toString().equalsIgnoreCase(answer)){
                    Toast.makeText(MainActivity.this, "Correct!", Toast.LENGTH_SHORT).show();
                    questionsCorrect++;
                    NextQuestion(currentQuestion++);
                }else{
                    countMistakes++;
                    if (countMistakes == numberOfMistakesAllowed) {
                        GameOver();
                    } else {
                        String livesLeft = (numberOfMistakesAllowed - countMistakes) + " live(s) left";
                        Toast.makeText(MainActivity.this, livesLeft, Toast.LENGTH_SHORT).show();
                    }
                }
                break;
        }
    }

    private void GameOver(){
        countMistakes = 0;

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder
                .setMessage("Game Over. You got " + questionsCorrect + "/" + numberOfQuestions + " correct.")
                .setCancelable(false)
                .setPositiveButton("Try Again", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    }
                })
                .setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        System.exit(0);
                    }
                });
        alertDialogBuilder.show();
    }

    private void NextQuestion(int num){
        if (num == numberOfQuestions) {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
            alertDialogBuilder
                    .setMessage("You finished the quiz!")
                    .setCancelable(false)
                    .setPositiveButton("Play Again", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        }
                    })
                    .setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            System.exit(0);
                        }
                    });
            alertDialogBuilder.show();
        } else {
            tv_question.setText(question.getQuestion(num));
            btn_one.setText(question.getChoice1(num));
            btn_two.setText(question.getChoice2(num));
            btn_three.setText(question.getChoice3(num));
            btn_four.setText(question.getChoice4(num));

            answer = question.getCorrectAnswer(num);
        }
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}