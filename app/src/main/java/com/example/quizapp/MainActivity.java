package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private  String[] quesations = {"Q1. Java was a interpreated " , "Q2. Java was easy to python?" , "Q3. Java was crteated using Pytho?" , "Q4. Java has abstaract classes?" , "Q5. java was OOP language?"};
    private boolean []  ans = {true , false , false , true ,true};
    private  int index = 0;
    private  int score = 0 ;
    TextView quastion;
    Button yes;
    Button no;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);
        quastion = findViewById(R.id.quastion);
        quastion.setText(quesations[index]);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index <= quesations.length - 1 ){
                    if (ans[index] == true){
                        score++;
                    }
                    index++;
                    if(index <= quesations.length -1 ){
                        quastion.setText(quesations[index]);
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Your Score is " + score + "/", Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(MainActivity.this, "Restart The App to play again", Toast.LENGTH_SHORT).show();
                }
            }
        });
        no.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (index <= quesations.length - 1 ){
                    if (ans[index] == false){
                        score++;
                    }
                    index++;
                    if(index <= quesations.length -1 ){
                        quastion.setText(quesations[index]);
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Your Score is " + score , Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(MainActivity.this, "Restart The App to play again", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}