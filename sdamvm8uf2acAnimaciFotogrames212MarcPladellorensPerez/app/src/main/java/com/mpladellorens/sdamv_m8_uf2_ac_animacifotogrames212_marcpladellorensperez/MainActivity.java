package com.mpladellorens.sdamv_m8_uf2_ac_animacifotogrames212_marcpladellorensperez;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imatge = (ImageView) findViewById(R.id.imageView);
        AnimationDrawable animacio = (AnimationDrawable) imatge.getDrawable();
        animacio.start();
    }
}