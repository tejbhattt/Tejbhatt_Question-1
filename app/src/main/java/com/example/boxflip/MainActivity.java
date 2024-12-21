package com.example.boxflip;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private FrameLayout box;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        box = findViewById(R.id.box);

        Button upButton = findViewById(R.id.up_button);
        Button downButton = findViewById(R.id.down_button);
        Button leftButton = findViewById(R.id.left_button);
        Button rightButton = findViewById(R.id.right_button);

        upButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animateBox(R.anim.flip_up);
            }
        });

        downButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animateBox(R.anim.flip_down);
            }
        });

        leftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animateBox(R.anim.flip_left);
            }
        });

        rightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animateBox(R.anim.flip_right);
            }
        });
    }

    private void animateBox(int animationResource) {
        Animation animation = AnimationUtils.loadAnimation(this, animationResource);
        box.startAnimation(animation);
    }
}

