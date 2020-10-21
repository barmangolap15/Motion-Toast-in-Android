package com.codewithgolap.motiontoast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import www.sanju.motiontoast.MotionToast;

public class MainActivity extends AppCompatActivity {

    Button successToast, errorToast, warningToast, infoToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        successToast = findViewById(R.id.successToast);
        errorToast = findViewById(R.id.errorToast);
        warningToast = findViewById(R.id.warningToast);
        infoToast = findViewById(R.id.infoToast);

        successToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MotionToast.Companion.createToast(MainActivity.this, "Success Toast",
                        MotionToast.TOAST_SUCCESS,
                        MotionToast.GRAVITY_BOTTOM,
                        MotionToast.LONG_DURATION,
                        ResourcesCompat.getFont(MainActivity.this, R.font.helvetica_regular));
            }
        });

        errorToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MotionToast.Companion.createColorToast(MainActivity.this, "Error Toast",
                        MotionToast.TOAST_ERROR,
                        MotionToast.GRAVITY_BOTTOM,
                        MotionToast.LONG_DURATION,
                        ResourcesCompat.getFont(MainActivity.this, R.font.helvetica_regular));
            }
        });

        warningToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MotionToast.Companion.darkToast(MainActivity.this, "Warning Toast",
                        MotionToast.TOAST_WARNING,
                        MotionToast.GRAVITY_BOTTOM,
                        MotionToast.LONG_DURATION,
                        ResourcesCompat.getFont(MainActivity.this, R.font.helvetica_regular));
            }
        });

        infoToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MotionToast.Companion.darkColorToast(MainActivity.this, "Info Toast",
                        MotionToast.TOAST_INFO,
                        MotionToast.GRAVITY_BOTTOM,
                        MotionToast.LONG_DURATION,
                        ResourcesCompat.getFont(MainActivity.this, R.font.helvetica_regular));
            }
        });
    }
}