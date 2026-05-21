package com.example.practica3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;


public class MainActivity extends AppCompatActivity {

    private ConstraintLayout myConstraintLayout;
    private TextView myTextView;
    private Button redButton;
    private Button greenButton;
    private Button yellowButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myConstraintLayout = findViewById(R.id.main);
        myTextView = findViewById(R.id.textView);
        redButton = findViewById(R.id.button_red);
        greenButton = findViewById(R.id.button_green);
        yellowButton = findViewById(R.id.button_yellow);

        yellowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            { myTextView.setText(R.string.yellow);
                //myConstraintLayout.setBackgroundColor(ContextCompat
                        //.getColor(MainActivity.this, R.color.yellowColor));
                yellowButton.setBackgroundColor(ContextCompat
                        .getColor(MainActivity.this, R.color.yellowColor));
                greenButton.setBackgroundColor(ContextCompat
                        .getColor(MainActivity.this, R.color.purple));
                redButton.setBackgroundColor(ContextCompat
                        .getColor(MainActivity.this, R.color.purple));
            }
        });

    }

    public void onGreenButtonClick(View view) {

        myTextView.setText(R.string.green);
        //myConstraintLayout.setBackgroundColor(ContextCompat.getColor(this,R.color.greenColor));
        greenButton.setBackgroundColor(ContextCompat.getColor(this, R.color.greenColor));
        redButton.setBackgroundColor(ContextCompat.getColor(this, R.color.purple));
        yellowButton.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.purple));
    }

    public void onRedButtonClick(View view) {
        myTextView.setText(R.string.red);
        //myConstraintLayout.setBackgroundColor(ContextCompat.getColor(this,R.color.redColor));
        redButton.setBackgroundColor(ContextCompat.getColor(this, R.color.redColor));
        greenButton.setBackgroundColor(ContextCompat.getColor(this, R.color.purple));
        yellowButton.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.purple));
    }


}