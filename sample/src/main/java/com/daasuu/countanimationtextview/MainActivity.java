package com.daasuu.countanimationtextview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.daasuu.library.CountAnimationTextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private CountAnimationTextView mCountAnimationTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCountAnimationTextView = (CountAnimationTextView) findViewById(R.id.count_animation_textView);

        Button button0 = (Button) findViewById(R.id.btn_count_anim_0);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCountAnimationTextView
                        .setAnimationDuration(5000)
                        .countAnimation(0, 99999);
            }
        });

        Button button1 = (Button) findViewById(R.id.btn_count_anim_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCountAnimationTextView
                        .setAnimationDuration(5000)
                        .countAnimation(99999, 0);
            }
        });

        Button button2 = (Button) findViewById(R.id.btn_count_anim_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCountAnimationTextView
                        .setDecimalFormat(new DecimalFormat("###,###,###"))
                        .setAnimationDuration(10000)
                        .countAnimation(0, 9999999);
            }
        });


        mCountAnimationTextView.setCountAnimationListener(new CountAnimationTextView.CountAnimationListener() {
            @Override
            public void onAnimationStart(Object animatedValue) {
                // do nothing
            }

            @Override
            public void onAnimationEnd(Object animatedValue) {
                mCountAnimationTextView.clearDecimalFormat();
            }
        });

    }
}
