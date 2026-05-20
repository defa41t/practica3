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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myConstraintLayout = findViewById(R.id.main);
        myTextView = findViewById(R.id.textView);

        Button yellowButton = findViewById(R.id.button_yellow);
        yellowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            { myTextView.setText(R.string.yellow);
                myConstraintLayout.setBackgroundColor(ContextCompat
                        .getColor(MainActivity.this, R.color.yellowColor));
            }
        });

    }

    public void onGreenButtonClick(View view) {

        myTextView.setText(R.string.green);
        myConstraintLayout.setBackgroundColor(ContextCompat.getColor(this,R.color.greenColor));
    }

    public void onRedButtonClick(View view) {
        myTextView.setText(R.string.red);
        myConstraintLayout.setBackgroundColor(ContextCompat.getColor(this,R.color.redColor));
    }


}