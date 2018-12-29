package com.example.ofekg.imagebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatImageButton;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public ImageView imageView;
    public ImageButton imageButton;
    int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageButton = findViewById(R.id.imgButton);
        imageView = findViewById(R.id.imgView);
    }

    public void go(View view) {
        Random rnd = new Random();
        num = rnd.nextInt(3) + 1;
        switch (num) {
            case 1: {
                imageView.setImageResource(R.drawable.number1);
                imageButton.setBackgroundResource(R.drawable.photo2);
                break;
            }
            case 2: {
                imageView.setImageResource(R.drawable.number2);
                imageButton.setBackgroundResource(R.drawable.photo3);
                break;
            }
            case 3: {
                imageView.setImageResource(R.drawable.number3);
                imageButton.setBackgroundResource(R.drawable.photo4);
                break;

            }
        }
    }
}
