package com.company.guessing_number;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class GameActivity extends AppCompatActivity {
    private TextView textViewLast,textViewGuess,textViewHint;
    private EditText editTextNumber;
    private Button buttonConfirm;

    boolean twoDigits,threeDigits,fourDigits;

    Random r = new Random();
    int random;
    int remaimingRigts =10;
    ArrayList<Integer> guessesList = new ArrayList<>();
    int userAttempts=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        textViewLast = findViewById(R.id.textViewLast);
        textViewGuess = findViewById(R.id.textViewGuess);
        textViewHint = findViewById(R.id.textViewHint);

        editTextNumber = findViewById(R.id.editTextNumber);

        buttonConfirm = findViewById(R.id.buttonConfirm);

        twoDigits = getIntent().getBooleanExtra("two",false);
        threeDigits = getIntent().getBooleanExtra("three",false);
        fourDigits = getIntent().getBooleanExtra("four",false);

        if(twoDigits)
        {
            random = r.nextInt(90)+10;
        }
        else if(threeDigits)
        {
            random = r.nextInt(900)+100;
        }
        else if(fourDigits)
        {
            random = r.nextInt(9000)+1000;
        }

        buttonConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String guess = editTextNumber.getText().toString();
                if(guess.equals(""))
                {
                    Toast.makeText(GameActivity.this, "Please enter a guess", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    textViewGuess.setVisibility(View.VISIBLE);
                    textViewLast.setVisibility(View.VISIBLE);
                    textViewHint.setVisibility(View.VISIBLE);

                    remaimingRigts--;
                    userAttempts++;
                    int userGuess = Integer.parseInt(guess);
                    guessesList.add(userGuess);

                    textViewLast.setText("Your Last Guess was: "+guess);
                    textViewGuess.setText("Your remaining rights are: "+remaimingRigts);

                    if(random==userGuess)
                    {
                        AlertDialog.Builder builder = new AlertDialog.Builder(GameActivity.this);
                        builder.setTitle("Number Guesses");
                        builder.setCancelable(false);
                        builder.setMessage("Congratulations!!. My guess was " + random +"\n\n You guessed my number in "+userAttempts+" attempts. " +
                                "\n\n Your Guesses: "+ guessesList +"\n\n Would you like to play again?");
                        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Intent intent = new Intent(GameActivity.this,MainActivity.class);
                                startActivity(intent);
                                finish();
                            }
                        });

                        builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                moveTaskToBack(true);
                                android.os.Process.killProcess(android.os.Process.myPid());
                                System.exit(1);
                            }
                        });

                        builder.create().show();

                    }

                    if(random<userGuess)
                    {
                        textViewHint.setText("Decrease your guess");

                    }
                    if(random>userGuess)
                    {
                        textViewHint.setText("Increase your guess");
                    }

                    if(remaimingRigts==0)
                    {
                        AlertDialog.Builder builder = new AlertDialog.Builder(GameActivity.this);
                        builder.setTitle("Number Guesses");
                        builder.setCancelable(false);
                        builder.setMessage("SORRY! Your Rights to guesses is OVER!!" + random +"\n\n My guess was "+random+
                                "\n\n Your Guesses: "+ guessesList +"\n\n Would you like to play again?");
                        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Intent intent = new Intent(GameActivity.this,MainActivity.class);
                                startActivity(intent);
                                finish();
                            }
                        });

                        builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                moveTaskToBack(true);
                                android.os.Process.killProcess(android.os.Process.myPid());
                                System.exit(1);
                            }
                        });

                        builder.create().show();

                    }
                    editTextNumber.setText("");
                }
            }
        });



    }
}