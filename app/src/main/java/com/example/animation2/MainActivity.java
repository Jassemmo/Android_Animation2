package com.example.animation2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView sharingan, dbz;
    private Button btnGo;
    // private Button btnStop;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharingan = findViewById(R.id.sharingan);
        dbz = findViewById(R.id.dbz);
        btnGo = findViewById(R.id.btnGo);
        // btnStop = findViewById(R.id.btnStop);



        btnGo.setOnClickListener(v -> {
            Rotation.rotateImage(0, 360, 6000, sharingan);
            Rotation.rotateImage(0, -360, 4000, dbz);
        });

        /* Bouton pour stopper l'animation :
        btnStop.setOnClickListener(v -> {

        });
         */


    }


}