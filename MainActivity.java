package com.example.ratingappassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    RatingBar ratingBar;
    TextView textView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.textView);
        ratingBar=findViewById(R.id.ratingBar);
        button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float givenRating= ratingBar.getRating();
                //int givenStars=ratingBar.getNumStars();

                if(givenRating<=2)
                    textView.setText("Given Rating: " + givenRating+"\nWe will work harder next time :)");
                else if(givenRating>2 && givenRating<3.5)
                    textView.setText("Given Rating: " + givenRating+"\nWe will try to improve :D");
                else
                    textView.setText("Given Rating: " + givenRating+"\nGlad you liked our services!");

            }
        });

    }
}